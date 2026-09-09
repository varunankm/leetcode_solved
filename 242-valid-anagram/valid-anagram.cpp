class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size()){
            return false;
        }
      vector<char> k;
      vector<char> g;  
      for(int i=0;i<s.size();i++){
        k.push_back(s[i]);
        g.push_back(t[i]);
      }
      sort(k.begin(),k.end());
      sort(g.begin(),g.end());
      if(k==g){
        return true;
      }
     return false;
    }
    
};