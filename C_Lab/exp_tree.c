#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

struct node
{
    char data;
    struct node *left;
    struct node *right;
};

struct stack
{
    struct node *stack[20];
    int top;
} s;

void push(struct node *temp)
{
    s.top++;
    s.stack[s.top] = temp;
}

struct node *pop()
{
    s.top--;
    return s.stack[s.top + 1];
}

struct node *create_node()
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    newnode->left = NULL;
    newnode->right = NULL;
    return newnode;
}

struct node *create_exp(char post[20])
{
    struct node *root = create_node();
    struct node *temp, *t1, *t2;
    int i;
    temp = root;
    for (i = 0; post[i] != '\0'; i++)
    {
        if (isalnum(post[i]))
        {
            temp = create_node();
            temp->data = post[i];
            push(temp);
        }
        else
        {
            temp = create_node();
            temp->data = post[i];
            t1 = create_node();
            t2 = create_node();
            t2 = pop();
            t1 = pop();
            temp->left = t1;
            temp->right = t2;
            push(temp);
        }
    }
    temp = pop();
    return temp;
}

void display(struct node *root)
{
    if (root != NULL)
    {
        display(root->left);
        printf("%c ", root->data);
        display(root->right);
    }
}

void main()
{
    char post[20];
    s.top = -1;
    struct node *root;
    printf("Enter postfix expression: \n");
    scanf("%s", post);
    root = create_exp(post);
    printf("Infix expression is: \n");
    display(root);
}