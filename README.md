# Computer Networking Concepts-
This is repository which was created by me in my second year as part of github learning process.

Note:This is not complete or accurate implementation of protocols.I tried to implement the working which I understood.

This repo consists of 3 programs which implements 3 concepts of connection oriented protocols-

1)StopandWait

2)GoBackN

3)Selective Repeat

What do terms mean?🤔
1)StopandWait
   ~StopandWait is simple connection oriented protocol which checks for acknowledgment from receiver after sending the packets.If ack is received then packets are                                                                                         	sent,otherwise it comes to halt.
   
Following diagram will help you understand better-
   ![image](https://user-images.githubusercontent.com/55348832/89562424-90a8bd80-d837-11ea-86ab-5dc3a58db4df.png)
   
2)GoBackN
   ~GoBackN was developed to remove the problem of StopandWait.It sends packets in specific window size.After sending packets,it slides the window.After sending all 	 the packets if receiver says it hasnt received a particular packet.Then all the packets <=packetnotreceived is sent again,which could create the problem of 	    	duplicate packets.
	
Following diagram will help you understand better-
	![image](https://user-images.githubusercontent.com/55348832/89563282-d87c1480-d838-11ea-82b0-92740dbbc85d.png)


	
3)SelectiveRepeat
	~SelectiveRepeat was developed to solve the problem of duplicate packets at receivers side.It follows the same procedure of sending packets as GoBackN but 	    sends only that packet instead of sending duplicate packets to receiver.
	
Following diagram will help you understand better-
	![image](https://user-images.githubusercontent.com/55348832/89562857-3ceaa400-d838-11ea-8569-8a3298ee73a4.png)


