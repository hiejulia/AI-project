## Content based recommendation 
- bag-of-words
- vector of numbers
- Euclidean distance: Content-based recommendations
- cosine similarity
- Term Frequency-Inverse Document Frequency (TF-IDF)
- nearest neighbor search 





## Collaborative filtering recommendations
- user-item matrix
- BM25 weighting
<a href="https://imgur.com/sMIAL9y"><img src="https://i.imgur.com/sMIAL9y.png" title="source: imgur.com" /></a>



## Matrix factorization
- "latent factors."
- Matrix factorization of the user-item matrix,
- "loss function,"
- multidimensional scaling
- minimize the error in reproducing the values of P:
<a href="https://imgur.com/WzYaV9f"><img src="https://i.imgur.com/WzYaV9f.png" title="source: imgur.com" /></a>

- convex function
- gradient descent 
- alternating least squares (ALS)
- massive parallelization available on a modern GPU
- implicit library : 




## tech stack 
- https://github.com/benfred/implicit
- ALS algorithm for computing the matrix factorization 
- internal nearest neighbor search or faiss (https://github.com/facebookresearch/faiss)
- Batch model training
- processing thread as real-time recommendation generation
- online model training: perform online matrix factorization (Google news personalization: scalable online collaborative filtering, Das, Abhinandan S., Mayur Datar, Ashutosh Garg, and Shyam Rajaram, in Proceedings of the 16th international conference on World Wide Web, pp. 271-280, ACM, 2007, https://dl.acm.org/citation.cfm?id=1242610)
- API refers to purchases, it may be used to keep track of any kind of implicit feedback, such as clicks, likes, listens, and so on.
- HTTP server supports multiple simultaneous connections
- Python Flask 
- faiss: nearest neighbor search






## resource 
- Google News (Google news personalization: scalable online collaborative filtering, Das, Abhinandan S., Mayur Datar, Ashutosh Garg, and Shyam Rajaram, in Proceedings of the 16th international conference on World Wide Web, pp. 271-280, ACM, 2007, https://dl.acm.org/citation.cfm?id=1242610), which must handle new users and new items (published news articles) on a continuous basis.


