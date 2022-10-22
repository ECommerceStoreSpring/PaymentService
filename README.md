# PaymentService

This payment service mainly focuses on how the system manages payments. This section has several functionalities with payments. They are, 
 ●	Show history of card payments
 ●	Show history all mobile payments
 ●	Add card details
 ●	Add mobile payment details
 ●	Show payment message

 After adding all the items which the user wants to buy, he/she will navigate to the payment UI. This is the place where users have to make the payment for what they are buying. First the user has to select the payment method. It can be either card payment or mobile payment. If it is a card payment, the user has to fill in the card details (card number, cvc number, name and amount) or if it is a mobile payment, he/she has to fill in the mobile details (Phone number, pin number and amount). After submitting the form, a request will be sent to the ‘Payment API Service’ for further payment processes.
