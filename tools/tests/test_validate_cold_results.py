import unittest

from tools import validate_cold_results as validator


class JavaRandomTest(unittest.TestCase):
    def test_matches_java_random_documented_first_values(self):
        random = validator._JavaRandom(0)
        self.assertEqual([random.next_int(100) for _ in range(5)], [60, 48, 29, 47, 15])


class PercentileTest(unittest.TestCase):
    def test_even_median_and_nearest_rank_p90(self):
        values = [9.0, 2.0, 4.0, 1.0]
        self.assertEqual(validator._p50(values), 3.0)
        self.assertEqual(validator._p90(values), 9.0)


class BlockedPlanTest(unittest.TestCase):
    def setUp(self):
        self.metadata = {
            "libraries": ["kotlinx", "jackson", "gson", "fory"],
            "operations": ["serialize", "deserialize"],
            "counts": [1, 10, 100],
            "samplesPerCell": 2,
            "randomizationSeed": 20260812,
        }

    def test_each_repetition_contains_exact_seeded_cell_block(self):
        plan = validator._expected_plan_cells(self.metadata)
        self.assertEqual(len(plan), 48)
        expected_cells = {
            (library, operation, count)
            for library in self.metadata["libraries"]
            for operation in self.metadata["operations"]
            for count in self.metadata["counts"]
        }
        self.assertEqual(set(plan[:24]), expected_cells)
        self.assertEqual(set(plan[24:]), expected_cells)
        self.assertNotEqual(plan[:24], plan[24:])


if __name__ == "__main__":
    unittest.main()
