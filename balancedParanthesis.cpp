#include<iostream>
#include<stack>
using namespace std;
int main() {
    long int t;
    cin >> t;
    for(long int j = 0; j < t; j++) {
        char *inp = (char *)malloc(10000 * sizeof(char));
        scanf("%s", inp);
        stack<long int> mystack;
        mystack.push(inp[0]);
        for(long int i = 1; inp[i] != '\0'; i++) {
            if((inp[i] == '(') || (inp[i] == '[') || (inp[i] == '{'))
                mystack.push(inp[i]);
            else if(((inp[i] == ')') || (inp[i] == ']') || (inp[i] == '}')) && (!mystack.empty())) {
                     char c;
                     if(inp[i] == ')')
                         c = '(';
                     else if(inp[i] == ']')
                              c = '[';
                          else
                              c = '{';
                     if(c != mystack.top()) {
                         printf("NO\n");
                         goto label;
                     }
                     mystack.pop();
                 }
                 else {
                     printf("NO\n");
                     goto label;
                }    
        }
        if(mystack.empty())
            printf("YES\n");
        else
            printf("NO\n");
        label:;
    }
    return 0;
}
