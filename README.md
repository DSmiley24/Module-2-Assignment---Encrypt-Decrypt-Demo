# Module-2-Assignment---Encrypt-Decrypt-Demo

In this README I will be going over how each of these files works, and my current understanding of the learning materials.

---------------------------------------------------------------------------------------------------------------------------

Let's begin with my current understanding of the learning materials.
There are two ways you can encrypt and decrypt information: Asymmetric and Symmetric. Asymmetric requires two keys - one to 
encrypt the daya (this key is usually public) and one super secret decryption key. While Symmetric only requires one key to 
both encrypt and decrypt the messages. Symmetric keys are excellent for when secret messages in bulk need to be decrypted, but
it's less secure than Asymmetric. The con of Asymmetric keys being they're far slower.

There are also plenty of different cyphers and encryption algothrithms like EDH, DHE, or RSA. I really don't remember much about 
the algorithms themselves. And frankly, the hardest part of this assignment was trying to put the algorithms into code form. I didn't
really end up doing that for the Symmetric.java file, but I think I got the point across that I understand how this works.

------------------------------------------------------------------------------------------------------------------------------

Symmetric.java was rather simple to program once I figured out what I wanted to do. I made an OOP where an object (test1) is created 
with both the secret number and the key. In this instance: The number is 27 and the key is 92. In the main method (where the testing 
happens) I call a couple different methods: encryptNum() and decryptNum(). The encryptNum() method simply alters the secret number so
it's not visible to those without the key. The decryptNum() method first checks to see if the number has been decrypted before actually
deciphering the secret number. The current state of this program doesn't really require any sort of knowing the key, but the key IS present.

-----------------------------------------------------------------------------------------------------------------------------

Asymmetric.java is where I really struggled. I couldn't really just do simple multiplication and division like in Symmetric.java, because one
key had to only be able to encrypt or decrypt the number. It look me some research but I managed to get it working in the end using BigIntegers.
The class variables: p, q, n, phi, e, and d, are all BigIntegers. p and q are prime numbers, n is the modulus (or the product of p and q), phi is
the totient function created by Euler, and lastly e and d are the encryption and decryption keys.

I have the same methods in this file as I do Symmetric.java (and they serve basically the same function) but I also have an additional one.
printKeys() is simply just a method to print both of the keys (d and e). The testing is also a bit different in this file, that being I created
the secret number in the main() method and not in the class itself. Everything else is still pretty much the same.

- Dominique Michael Lamar Smiley :D
