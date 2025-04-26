class Solution {
public:
    void dfs(vector<vector<int>>& adj_list, vector<int>& component,
             unordered_set<int>& found, int node) {
        component.push_back(node);
        found.insert(node);

        for (auto it : adj_list[node]) {
            if (found.find(it) == found.end())
                dfs(adj_list, component, found, it);
        }
    }
    int findCircleNum(vector<vector<int>>& isConnected) {
        vector<vector<int>> adj_list(isConnected.size());
        for (int i = 0; i < isConnected.size(); i++) {
            for (int j = 0; j < isConnected.size(); j++) {
                if (isConnected[i][j] == 1) {
                    if (i != j) {
                        adj_list[i].push_back(j);
                    }
                }
            }
        }

        vector<vector<int>> ans;
        unordered_set<int> found;

        for (int i = 0; i < isConnected.size(); i++) {
            if (found.find(i) == found.end()) {
                vector<int> component;
                dfs(adj_list, component, found, i);

                ans.push_back(component);
            }
        }

        return ans.size();
    }
};