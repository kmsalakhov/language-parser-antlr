Придумайте хороший императивный язык программирования, на котором приятно писать программы. Транслируйте с него в Си.


Пример:

a, b = readint(), readint()

a, b = b, a

print(a + b)


Вывод:

int main() {

    int a, b;
    
    scanf("%d%d", a, b);
    
    int ta = a;
    
    int tb = b;
    
    a = tb;
    
    b = ta;
    
    printf("%d", a + b);
    
}

