#include <stdio.h>
#include <stdlib.h>
#define MAX_ADJ 5
#define MAX_VERTEX 10

struct node
{
    int data;
    int adj[MAX_ADJ][2];
};

struct stack
{
    int top;
    int stack[MAX_VERTEX];
} s;

struct queue
{
    int front;
    int rear;
    int queue[MAX_VERTEX];
} q;

struct node *create_node()
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    newnode->adj[0][0] = -1;
    return newnode;
}

void link(struct node *head, int adj)
{
    int i = 0, weight;
    while (head->adj[i][0] != -1 && i < MAX_ADJ)
    {
        if (head->adj[i][0] == adj)
        {
            printf("Link already exists\n");
            return;
        }
        i++;
    }
    if (i > MAX_ADJ)
    {
        printf("Max branch limit for vertex reached\n");
    }
    else
    {
        head->adj[i][0] = adj;
        printf("Enter weight of the link: \n");
        scanf("%d", &weight);
        head->adj[i][1] = weight;
        head->adj[i + 1][0] = -1;
    }
}

void main()
{
    struct node *heads[MAX_VERTEX];
    int i, num_vertices, visited[MAX_VERTEX], choice, src, dest;
    printf("Enter number of vertices: \n");
    scanf("%d", num_vertices);
    for (i = 0; i < MAX_VERTEX; i++)
    {
        heads[i] = NULL;
        visited[i] = -1;
    }
    for (i = 0; i < num_vertices; i++)
    {
        heads[i] = create_node;
        visited[i] = 0;
    }
    while (1)
    {
        printf("Enter your choice: \n1. Create Link \n2. BFS \n3. DFS \n4. Exit\n\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter the source vertex: \n");
            scanf("%d", &src);
            if (src >= num_vertices)
            {
                printf("Vertex does not exist");
            }
            printf("Enter the adjacent vertex: \n");
            scanf("%d", &dest);
            if (dest >= num_vertices)
            {
                printf("Vertex does not exist");
            }
            link(heads[src], dest);
            break;
        case 4:
            exit(0);
            break;

        default:
            break;
        }
    }
}