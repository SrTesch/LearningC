#include <stdio.h>
#include <stdlib.h>

void gotoxy(int x,int y)
{
    printf("%c[%d;%df",0x1B,y,x);
}

int main(){
    gotoxy(10,20); printf("\x1B[1;31;34meusoulindo");
    return 0;
}

// int y=2;
// while(y<3){
//     gotoxy(2,y); printf("criando nova lista!");
//     y++;
// }