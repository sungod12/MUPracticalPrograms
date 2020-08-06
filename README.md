# Computer Networking Concepts-
This is repository which was created by me in my second year as part of github learning process.

This repo consists of 3 programs which implements 3 concepts of connection oriented protocols-

1)StopandWait

2)GoBackN

3)Selective Repeat

What do terms mean?🤔
1)StopandWait
   ~StopandWait is simple connection oriented protocol which checks for acknowledgment from receiver after sending the packets.If ack is received then packets are                                                                                      	sent,otherwise it comes to halt.
   
2)GoBackN
	~GoBackN was developed to remove the problem of StopandWait.It sends packets in specific window size.After sending packets,it slides the window.After sending all the 
	packets if receiver says it hasnt received a particular packet.Then all the packets <=packetnotreceived is sent again,which could create the problem of duplicate 		packets.
3)SelectiveRepeat
	~SelectiveRepeat was developed to solve the problem of duplicate packets at receivers side.It follows the same procedure of sending packets as GoBackN but sends only
	that packet instead of sending duplicate packets to receiver.
    

