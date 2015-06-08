#include <stdio.h>

int main(void)
{
    printf("Your name: ");
    char name[45];
    scanf("%s", name);
    printf("Hello, world!\n");
    printf("Have a nice day, %s!\n", name);
    return 0;
}
