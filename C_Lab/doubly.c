#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *prev;
    struct node *next;
};

struct node *create_node()
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    newnode->next = NULL;
    return newnode;
}

struct node *create_ll(struct node *head)
{
    struct node *temp;
    int ele;
    printf("Enter element to insert: \n");
    scanf("%d", &ele);
    if (head = NULL)
    {
        head = create_node();
        head->data = ele;
        head->prev = NULL;
    }
    else
    {
        temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = create_node();
        temp->next->prev = temp;
        temp->next->data = ele;
    }
    return head;
}

struct node *insert(struct node *head)
{
    int pos, i = 1, ele;
    struct node *temp, *temp1;
    printf("Enter element to enter: \n");
    scanf("%d", &ele);
    if (head == NULL)
    {
        printf("List created, 1st element entered\n");
        head = create_node();
        head->prev = NULL;
        head->data = ele;
        return head;
    }
    printf("Enter position to insert at: \n");
    scanf("%d", &pos);
    if (pos == 1)
    {
        temp = create_node();
        temp->prev = NULL;
        temp->next = head;
        head->prev = temp;
        temp->data = ele;
        return temp;
    }
    else
    {
        temp1 = head;
        while (head->next != NULL)
        {
            i++;
            head = head->next;
            if (i == pos)
            {
                temp = create_node();
                temp->prev = head->prev;
                temp->next = head;
                head->prev->next = temp;
                head->prev = temp;
                temp->data = ele;
            }
            else if (i > pos)
                break;
        }
        if (i < pos)
        {
            printf("Position does not exist, inserting at end\n");
            temp = create_node();
            temp->prev = head;
            head->next = temp;
            temp->data = ele;
        }
        return temp1;
    }
}

struct node *delete (struct node *head)
{
    int pos, i = 1;
    struct node *temp;
    if (head == NULL)
    {
        printf("Empty list\n");
        return head;
    }
    else if (head->next == NULL)
    {
        head = NULL;
        printf("List is now empty\n");
        return head;
    }
    else
    {
        printf("Enter position to delete: \n");
        scanf("%d", &pos);

        if (pos == 1)
        {
            head = head->next;
            head->prev = NULL;
            return head;
        }
        else
        {
            temp = head;
            while (head->next != NULL)
            {
                printf("Hello");
                i++;
                head = head->next;
                if (i == pos)
                {
                    head->prev->next = head->next;
                    if (head->next != NULL)
                    {
                        head->next->prev = head->prev;
                    }
                    return temp;
                }
            }
            if (i < pos)
            {
                head->prev->next = NULL;
            }
        }
    }
    return temp;
}

void display(struct node *head)
{
    if (head == NULL)
    {
        printf("List empty\n");
        return;
    }

    printf("List elements are: \n");
    while (head != NULL)
    {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

void display_rev(struct node *head)
{
    if (head == NULL)
    {
        printf("List empty\n");
        return;
    }
    printf("Linked list elements in reverse are: \n");
    while (head->next != NULL)
    {
        head = head->next;
    }
    while (head != NULL)
    {
        printf("%d ", head->data);
        head = head->prev;
    }
    printf("\n");
}

int count(struct node *head)
{
    int count = 0;
    if (head == NULL)
    {
        printf("Empty\n");
    }
    else
    {
        while (head != NULL)
        {
            head = head->next;
            count++;
        }
        printf("Number of elements is: %d\n", count);
    }
    return count;
}

struct node *reverse(struct node *head)
{
    struct node *temp1;
    while (head != NULL)
    {
        temp1 = head->prev;
        head->prev = head->next;
        head->next = temp1;
        head = head->prev;
    }
    printf("List has been reversed\n");
    return temp1->prev;
}

void main()
{
    int choice;
    struct node *head = NULL;
    while (1)
    {
        printf("Enter choice: \n1. Insert \n2. Delete \n3. Display \n4. Display in reverse \n5. Count \n6. Reverse \n7. Exit \n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            head = insert(head);
            break;
        case 2:
            head = delete (head);
            break;
        case 3:
            display(head);
            break;
        case 4:
            display_rev(head);
            break;
        case 5:
            count(head);
            break;
        case 6:
            head = reverse(head);
            break;
        case 7:
            exit(0);
        default:
            printf("Invalid input \n");
        }
    }
}
