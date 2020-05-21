#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

struct node *create_node()
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    newnode->left = NULL;
    newnode->right = NULL;
    return newnode;
}

// struct node *data_node(struct node *newnode){
//     int ele;
//     printf("Enter element to insert: \n");
//     scanf("%d", &ele);
//     newnode->data = ele;
//     return newnode;
// }

struct node *insert(struct node *root, int ele)
{
    if (root == NULL)
    {
        root = create_node();
        root->data = ele;
        return root;
    }
    else if (root->data > ele)
    {
        root->left = insert(root->left, ele);
    }
    else if (root->data < ele)
    {
        root->right = insert(root->right, ele);
    }
    else
    {
        printf("Element already exists in tree\n");
        return root;
    }
    printf("Element inserted: \n");
    return root;
}

struct node *delete (struct node *root, int ele)
{
    struct node *temp;
    if (root == NULL)
    {
        return root;
    }
    else if (ele == root->data)
    {
        // flag = 1;
        if (root->left == NULL && root->right == NULL)
            root = NULL;
        else if (root->left != NULL && root->right == NULL)
            root = root->left;
        else if (root->right != NULL && root->left == NULL)
            root = root->right;
        else
        {
            temp = root->right;
            while (temp->left != NULL)
            {
                temp = temp->left;
            }
            root->data = temp->data;
            temp = NULL;
        }
        printf("Element deleted\n");
        return root;
    }
    else
    {
        // if (flag == 1)
        // return root;
        root->left = delete (root->left, ele);
        root->right = delete (root->right, ele);
    }

    return root;
}

void display(struct node *root)
{
    if (root == NULL)
    {
        return;
    }
    else
    {
        display(root->left);
        printf("%d ", root->data);
        display(root->right);
    }
}

int search(struct node *root, int ele, int pos)
{
    if (root == NULL)
        return pos - 1;
    if (root->data == ele)
    {
        printf("Element found at preorder position %d\n", pos);
    }
    else
    {
        pos++;
        pos = search(root->left, ele, pos);
        pos++;
        pos = search(root->right, ele, pos);
    }
}

void traverse(struct node *root)
{
    struct node *current, *lower;
    if (root == NULL)
    {
        printf("Empty tree\n");
        return;
    }
    else
    {
        current = root;
        while (current != NULL)
        {
            if (current->left == NULL)
            {
                printf("%d ", current->data);
                current = current->right;
            }
            else
            {
                lower = current->left;
                while (lower->right != NULL && lower->right != current)
                {
                    lower = lower->right;
                }
                if (lower->right == NULL)
                {
                    lower->right = current;
                    current = current->left;
                }
                else
                {
                    lower->right = NULL;
                    printf("%d ", current->data);
                    current = current->right;
                }
            }
        }
    }
}

int count(struct node *root, int pos)
{
    if (root == NULL)
        return pos - 1;
    else
    {
        pos++;
        pos = count(root->left, pos);
        pos++;
        pos = count(root->right, pos);
    }
    return pos;
}

int leaf_count(struct node *root, int pos)
{
    if (root->left == NULL && root->right == NULL)
        return pos++;
    else
    {
        pos = count(root->left, pos);
        pos = count(root->right, pos);
    }
}

void main()
{
    int choice, ele, total, leaf;
    struct node *root = NULL;
    while (1)
    {
        printf("Enter choice: \n1. Insert \t\t2. Delete \n3. Search \t\t4. Traverse \n5. Count \t\t6. Leaf nodes \n7. Interior nodes \t8. Exit \n\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter element to enter: \n");
            scanf("%d", &ele);
            root = insert(root, ele);
            display(root);
            break;
        case 2:
            if (root == NULL)
                printf("Tree empty\n");
            else
            {
                printf("Enter element to delete :\n");
                scanf("%d", &ele);
                root = delete (root, ele);
            }
            display(root);
            break;
        case 3:
            printf("Enter element to search: \n");
            scanf("%d", &ele);
            search(root, ele, 1);
            break;
        case 4:
            traverse(root);
            printf("\n");
            break;
        case 5:
            total = count(root, 1);
            printf("Number of nodes is %d\n", total);
            break;
        case 6:
            leaf = leaf_count(root, 0);
            printf("Number of leaf nodes is: %d\n", leaf);
            break;
        case 7:
            total = count(root, 1);
            leaf = leaf_count(root, 0);
            printf("Number of interior nodes is: %d\n", total - leaf - 1);
            break;
        case 8:
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }
}