#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
};

struct node *create_node(){
	int ele;
	struct node *newnode = (struct node *)malloc(sizeof(struct node));
	printf("Enter element to input: \n");
	scanf("%d",&ele);
	newnode->next = NULL;
	newnode->data = ele;
	return (newnode);
}	

struct node *create_node_simple(){
	struct node *newnode = (struct node *)malloc(sizeof(struct node));
	newnode->next = NULL;
	return (newnode);
}

/*void insert_end(struct node *head, int ele){
	struct node *newnode, *temp;
	temp = head;
	newnode = create_node();
	newnode->data = ele;
	if(head == NULL){
		head = newnode;
		return;
	}
	while(temp->next != NULL){
		temp = temp->next;
	}
	temp->next = newnode;
}
*/

struct node *insert_end(struct node *head, int ele){
	struct node *newnode, *temp;
	temp = head;
	newnode = create_node_simple();
	newnode->data = ele;
	if(head == NULL){
		head = newnode;
	}
	while(temp->next != NULL){
		temp = temp->next;
	}
	temp->next = newnode;
	return head;
}



void display(struct node *head){
	struct node*temp;
	temp = head;
	if(head == NULL){
		printf("Empty\n");	
	}
	else{
		printf("Linked list elements are: \n");
		while(temp->next!=NULL){
		printf("%d ",temp->data);
		temp= temp->next;
		}
	}
}

void main(){
	struct node *head = NULL;
	struct node *head1 = NULL;
	struct node *head2 = NULL;
	struct node *temp;
	struct node *curr = NULL;
	struct node *prev = NULL;
	struct node *ahead = NULL;
	int choice, num1, num2, i;
	printf("Enter number of elements for list 1: \n");
	scanf("%d",&num1);
	printf("For list 1: \n");
	for(i=0;i<num1;i++){
		if(head1 == NULL){
			head1 = create_node();
			temp = head1;
			continue;
		}
		temp->next = create_node();
	}	
	printf("Enter number of elements for list 2: \n");
	scanf("%d",&num2);
	printf("For list 2: \n");
	for(i=0;i<num2;i++){
		if(head2 == NULL){
			head2 = create_node();
			temp = head2;
			continue;
		}
		temp->next = create_node();
	}
	while(1){
		printf("Enter choice of operation: \n1. Copy \n2.Concatenate \n3. Split \n4. Reverse \n5. Count nodes \n6. Exit \n\n");
		scanf("%d",&choice);
		switch(choice){
			case 1: display(head1);
					temp = head1;
					for(i=0;i<num1;i++){
						insert_end(head, temp->data);
					}
					printf("Copied list is: \n");
					display(head);
				break;
			case 2: temp = head1;
					for(i=0;i<num1;i++){
						insert_end(head, temp->data);
					}
					temp = head2;
					for(i=0;i<num2;i++){
						head = insert_end(head, temp->data);
					}
					printf("After concatenation: \n");
					display(head);
				break;
			case 3: printf("Enter position to split at: \n");
					scanf("%d", &choice);
					temp = head1;
					for(i=0; i<choice; i++){
						temp = temp->next;
					}
					head = temp->next;
					temp->next = NULL;
					printf("After split: \n");
					printf("List 1: ");
					display(head1);
					printf("List 2");
					display(head);
				break;
			case 4: curr = head1;
					while(curr!=NULL){
						ahead = curr->next;
						curr->next = prev;
						prev = curr;
						curr = ahead;
					}
					printf("After reversing: ");
					display(head1);
				break;
			case 5: choice = 0;
					temp = head1;
					while(temp->next != NULL){
						choice++;
						temp = temp->next;
					}
					printf("List 1 has %d nodes", choice);
				break;
			case 6: exit(0);
			default: printf("Invalid choice");
		}
	}
}




