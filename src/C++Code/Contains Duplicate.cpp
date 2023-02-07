#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {

        if (nums.empty()) {
            return true;
        }

        sort(nums.begin(), nums.end());

        for (int i = 1; i < nums.size(); i++) {
            if (nums.at(i) == nums.at(i - 1)) {
                return true;
            }
        }

        return false;

    }
};
