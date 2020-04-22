# AI projects
Proof of concept of the state of the art AI with practical & research examples 
(with code demos)
- narrow AI 
- general AI 
- super AI 


## Collections of algorithms optimization 

+ Optimal path using BFS, DFS 
+ AI search algo 


## AI search algo 
- dijkstra search 
- heuristics 
- A* algo
    


## AI algorithm
+ Determined the optimal next move of a chessboard game using Minimax algorithm with Alpha-beta pruning
- The minimum cost transaction for a goal state 
- A sequence of transitions to a minimum cost goal 
- A minimum cost transaction for a minimum cost goal 



## AI in Finance 



## AI in Bioinformatics 



## AI in game 
- rule based system 
- Prolog 
    - `swipl`
    - `brew install swi-prolog`
    - prolog query 
    <a href="https://imgur.com/cEGMZb0"><img src="https://i.imgur.com/cEGMZb0.png" title="source: imgur.com" /></a>


- The min-max algorithm


## Edge AI 
- edge service 
    - smartphone 
    - devices 
    - microcontroller 
- openvm
- jevois 
- google edge TPU 
- movidius 
- nvidia jetson 
- UP AI Edge 
- Ultra96 
- TF Lite 
- utensor
- qualcomm neural processing SDK for AI 
- huawei NPU 

## AI use case 
- fraud detection 
- https://www.gurobi.com/
- integer linearn programming
    - https://www.gurobi.com/
    - https://www.ibm.com/analytics/cplex-optimizer

- robotics 
    - https://www.ros.org/




## AI in IoT 
- Self driving solution 
- Safe route parameter to trip planners 
- Apply CNN to parking lot 
- Apply SVM to safety on trip planning 
- Teaching MDP to find the safest route 


- set up RL-DL-CRLMM model
    - webcam images in real time 
    - CRL- CNN 
        - gap in parking lot 
        - SVM - optimizer 
        - MDP 
        - RL - DL - CRLMM find parking lot - available space 
        - Circular RL- DL - CRLMM 
            - CNN 
            - Markov decision process MDP 
            - CRLMM - recognize parkigng space in parking lot and send signal to self signal to self driving vehicle 
                - gaps, space between 2 objects 
                - context to establish whether this space between objects is positive or negative distance 


- IP camera : obtain right real time frames from webcam : lighting const, etc 
- Dataset : 
    - training set, test set 
- model trained : CNN Concept Strategy. py 
    - Classify parking lot : 
- Add SVM function to increase safety level 
    - avoid traffic 
    - read lat/long of datapoint in another table to convet back to GPS format 
    - sklearn
    <a href="https://imgur.com/LShCcXm"><img src="https://i.imgur.com/LShCcXm.png" title="source: imgur.com" /></a> 
    - `make_blobs`

- classify


- IP camera 
    - Webcam can be tested 
    - webcam freeze a frame of a parking lot 

- Computer vision 
    - simulate frozen frame
    <a href="https://imgur.com/afQSh2z"><img src="https://i.imgur.com/afQSh2z.png" title="source: imgur.com" /></a>
- Run CRLMM 
    - Find parking space 
    - CRL-MM-IoT-SVM.py 

- decide how to get to the parking lot 
    - `crlmm == 1`
    - find a safe route to SDC -> activate SVM -> `safeSVM()` -> traffic graph 
    - send info to Google Maps -> script to read dataset that contains GPS coordinate for each datapoint in the SVM 
<a href="https://imgur.com/BGsMWVj"><img src="https://i.imgur.com/BGsMWVj.png" title="source: imgur.com" /></a>
<a href="https://imgur.com/FwxQRQs"><img src="https://i.imgur.com/FwxQRQs.png" title="source: imgur.com" /></a>
- Itinerary graph 
    
- Weight vector 
    - vertex weights (safest route) are updated after MDP 






### Data Access and Distributed Processing for IoT
- Hadoop's Distributed File System
- HDF5 
    -  PyArrow's filesystem interface for HDFS
- SQL, NoSQL
- 

- Dataset 
    - 9,568 data points collected from a combined cycle power plant (CCPP)
        - http://archive.ics.uci.edu/ml/datasets/combined+cycle+power+plant
    - Wine quality dataset
        - https://archive.ics.uci.edu/ml/datasets/Wine+Quality
    - Air quality data
        - https://www.kaggle.com/c/predict-impact-of-air-quality-on-death-rates



    


## ML algorithms 
### Image classification 
+ Build Nearest neighbour classifier for classifying different categories of images using K Means Clustering for effiency
+ Component analysis - histogram 
+ Classification feature 
+ Different distance measures for the nearest neighbour classifier was evaluated 

### Recommendation system 
+ Cluster algorithm - Reduce search space 
+ MapReduce to process large dataset 
+ ML model designed for content-based recommendation 
+ Cluster algorithm - reduce search space 
+ Leverage locality sensitive hashing LSH method to find similar users for a large dataset - 1GB 

- BM25 weighting
- Efficient nearest neighbor search
- matrix factorization
- https://github.com/benfred/implicit
- efficient nearest neighbor search: https://github.com/facebookresearch/faiss

## Image drawer program Mona Lisa 



## Deep learning 
- backpropagation
- gradient descent
- “skip connections”
- batch normalization 
- RNN : text, speech , time series data
- XOR
- multi layer, feed forward NN 



### NLP & sentimental analysis with RNTN 
- Background on natural language processing (NLP) and sentiment analysis
- Core NLP: https://stanfordnlp.github.io/CoreNLP/
    - NLP processing such as sentence detection
    - word detection
    - part-of-speech tagging, named-entity recognition (finding names of people, places, dates, and so on), and sentiment analysis. 
    - Several NLP features, such as sentiment analysis, depend on prior processing including sentence detection, word detection, and part-of-speech tagging.
    - 85.4% accuracy for detecting positive/negative sentiment of sentences.
- Recursive neural tensor networks (RNTN) 
- twitter & reddit api 
- Data aggregation 
- Sentiment detector
    - libraries, hbc-core, JRAW, and Crux.

### CoreNLP processing pipeline 
- tokenization
- dependency tree
- annotations
-  part-of-speech tags





### Optimize running time 
+ Parallel processing and fault tolerance 
+ Optimize Map Reduce framework 
  + Support parallel processing 
  + Optimize scripts for map and reduce stage 
  
+ Distributed 


### Google Cloud AI Services 
- Cloud based machine learning 
- Cloud Vision API 
    - detect explicit content 
    - landmark detection 
    - optical character recognition 
    - face detection 
    - image attributes 
- Cloud Speech API 
- Cloud AutoML 
- Cloud TPU 
- Cloud ML engine
- Cloud natural language
    - syntax analysis
    - entity recognition 
    - sentiment analysis 
    - multi language 
    - integrated REST API 
- Cloud Speech API 
    - global vocab
    - streaming recognition 
    - word hints
    - real time / prerecorded audio support
    - noise robustness 
    - inappropriate content filtering 
- cloud translation API 
    -     

- cloud vidio inteligence 
    - label detection 
    - shot change detection 
    - video trans
    - explicit content detection 

#### project detection-gcloudvision 
- face detection 
- label detection 
- safe search detection 
- video inteligence api 
    - label, search video catalogues, distinguish scenes using shot detection 
    - content recommendation, content moderation, contextual ads, search media archives 
- cloud speech api 
    - streaming speech recognition 
    - audio to text with speech recognition 

- cloud NLP 
    - sentiment analysis 
    - entity analysis 
    - 
#### Tech stack 
- Java 
    - NN : (http://neuroph.sourceforge.net/index.html), Deeplearning4j
    - NLP : CoreNLP, OpenNLP
    - ML : JavaML, Weka, SMILE
    - ComputerVision : JavaCV
    - Tensorflow
    - keras 


- Python 
- Prolog
- https://github.com/spotify/snakebite




#### Resources / Ref 
+ https://www.cs.waikato.ac.nz/ml/weka/ 
- https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html
- https://cloud.google.com/products/
- https://blogs.nvidia.com/blog/2016/07/29/whats-difference-artificial-intelligence-machine-learning-deep-learning-ai/
- http://jevois.org/
- https://cloud.google.com/edge-tpu/
- https://www.nvidia.com/en-us/autonomous-machines/embedded-systems/
- https://www.96boards.org/product/ultra96/ai/
- https://www.tensorflow.org/lite/
- http://docs.openmv.io/
- http://mpqa.cs.pitt.edu/opinionfinder/opinionfinder_2/
- https://en.wikipedia.org/wiki/AI_winter
- https://en.wikipedia.org/wiki/Computer_chess
- https://en.wikipedia.org/wiki/Watson_(computer)
- https://cloud.google.com/products/ai/
- https://stockfishchess.org/
- https://link.springer.com/chapter/10.1007%2F978-3-540-72079-9_10
- https://www.technologyreview.com/2017/04/11/5113/the-dark-secret-at-the-heart-of-ai/
- https://prodi.gy/
- https://github.com/mnielsen/neural-networks-and-deep-learning
- https://towardsdatascience.com/what-the-hell-is-perceptron-626217814f53
- http://deeplearning.stanford.edu/wiki/index.php/UFLDL_Tutorial



#### Applied Research paper/ Publication 
- Microsoft research 
    - Home Automation in the Wild: Challenges and Opportunities
    