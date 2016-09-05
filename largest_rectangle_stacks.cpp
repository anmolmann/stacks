#include <iostream>
#include<stack>
#include<stdlib.h>
using namespace std;
int getMaxArea(unsigned long long int *a, unsigned long long int n)
{
    stack<unsigned long long int> s;
    unsigned long long int max_area = 0, tp, area_with_top, i = 0;
    while (i < n)
    {
        if (s.empty() || a[s.top()] <= a[i])
            s.push(i++);
        else
        {
            tp = s.top();
            s.pop();
            if(s.empty())
                area_with_top = a[tp] * i;
            else
                area_with_top = a[tp] * (i - s.top() - 1);
            if (max_area < area_with_top)
                max_area = area_with_top;
        }
    }
    while (!s.empty())
    {
        tp = s.top();
        s.pop();
        if(s.empty())
                area_with_top = a[tp] * i;
        else
                area_with_top = a[tp] * (i - s.top() - 1);
        if (max_area < area_with_top)
            max_area = area_with_top;
    }
    return max_area;
}
int main()
{
    unsigned long long int n;
    cin >> n;
    unsigned long long int *a;
    a=(unsigned long long *)malloc(100000 * sizeof(unsigned long long ));
    for(unsigned long long int i = 0; i < n; i++)
        cin >> a[i];
    cout << getMaxArea(a, n);
    return 0;
}
