
//fixed size linear queue implementation

import java.util.Scanner;
public class main{
    public static boolean isFull(int front,int rear,int max){
        if(rear==max-1)
                return true;
        return false;
            
        
    }
    public static boolean isEmpty(int front,int rear){
        if(front==-1&&rear==-1)
             return true;
        return false;
             
    }
    
    public static void main(String[] args){
        int max=4;
        int queue[]=new int[max];
        int front=-1;
        int rear=-1;
        Scanner sc=new Scanner(System.in);
    while(true){
          System.out.println("\n1:Enqueue\n2:Dequeue\n3:getFront\n4:getRear\n5:isEmpty\n6:print\n7:isFull\n8:exit\n");
          int choice=sc.nextInt();
          switch(choice){
              case 1:if(isFull(front,rear,max))System.out.println("Queue Overflow");
                   else{
                       System.out.println("Enter data:");
                       int data=sc.nextInt();
                       queue[++rear]=data;
                       if(front==-1)
                           front++;
                           
                   }
                   break;
            case 2: if(isEmpty(front,rear)) System.out.println("Queue Underflow");
            else if(front==rear) 
            {
                front=-1;
                rear=-1;
            }
            else{
                System.out.println("Element deleted is "+ queue[front]);
                front++;
            }
               break;
            case 3:if(isEmpty(front,rear)) System.out.println("Queue underflow");
                else{
                    System.out.println("Front element is "+ queue[front]);
                }break;
            case 4:if(isEmpty(front,rear)) System.out.println("Queue under flow");
                else{
                    System.out.println("Rear element is "+ queue[rear]);
                }break;
            case 5:if(isEmpty(front,rear))
                      System.out.println("Queue is empty");
                    else
                        System.out.println("Queue is not empty");
                    break;
            case 6:if(isEmpty(front,rear)) System.out.println("Queue is Empty");
             else{
              for(int i=front;i<=rear;i++){
                  System.out.print(queue[i]+" ");
                  
              }   
              System.out.println();
             }
             break;
          
          case 7:if(isFull(front,rear,max))
                  System.out.println("Queue is full");
                else
                   System.out.println("Queue is not full");
                 break;
          case 8:System.exit(0);
          
          }    
        
        
       
        
        
        
    }
    }
    
    
    
}
