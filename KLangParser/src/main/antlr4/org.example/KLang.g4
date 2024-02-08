grammar KLang;

@header {
package org.example;
}

@members {
    private void print(String s) {
        System.out.print(s);
    }

    private void println(String s) {
        System.out.println(s);
    }
}

program: { println("#include <stdio.h>\nint main() {");} statement+ EOF { println("return 0;\n}");};


statement: declaration
         | assignment
         | ifStatement
         | while
         | functionCall
         | forn
         | sout
         ;

sout: '!' expression ';' {
print("printf(\"%d\", ");
print($expression.text);
println(")");
};

declaration: 'var' ID ';' {println("int " + $ID.text + ";");};

assignment: ID '=' expression ';' {println($ID.text + " = " + $expression.text + ";");};

ifStatement: { print("if ("); }
    'if' '(' condition ')'
    { println(") {"); }
    '{' statement+ '}'
    { println("}"); }
    ({ println("else {"); } 'else' '{' statement+ '}'{ println("}"); })?;

while: { print("while ("); }
    'while' '(' condition ')'
    { println(") {"); }
    '{' statement+ '}'
    { println("}"); };

forn: 'forn' '(' expression ')'
    {print("for (int i = 0; i < ");
     print($expression.text);
     println("; ++i) {");}
    '{' statement+ '}' {println("}");};



condition: expression ((LESS | GREATER | EQ | NEQ | LE | GE) expression) {print($text);};

expression: term (('+' | '-') term)*;


term: factor (('*' | '/') factor)*;

factor: INT
      | ID
      | '(' expression ')';

functionCall: expression '(' ((expression ',')* expression)? ')' ';' {println($text);};


LESS: '<';
GREATER: '>';
EQ: '==';
NEQ: '!=';
LE: '<=';
GE: '>=';
ID: [a-zA-Z]+;
INT: [0-9]+;

WS: [ \t\r\n]+ -> skip;


