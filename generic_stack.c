#include<stdio.h>
#include"stack.h"
int main() {
    push((char *)"hello");
    int a[] = {5, 7};
    push(&a[0]);
    push(&a[1]);
    printf("%d %d\n", *(int *)pop(), *(int *)pop());
    printf("\n%s\n", (char *)pop());
    return 0;
}
