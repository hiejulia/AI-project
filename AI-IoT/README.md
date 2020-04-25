# AI in IoT 

- Wearables
- monitor heart using ML
- smart home 

- SuperSecure
    - CCTV 
    - AI powered smart surveillance solution 


- smart lighting 
    - If This Then That (IFTTT)
    - train AI to classify human activities from videos 
    - use the trained AI to detected action of the person in the room 
    

- Electrical load forecase 
    - dataset : https://archive.ics.uci.edu/ml/datasets/Individual+household+electric+power+consumption#


## IoT and smart homes

- voice command interface 
- Amazon Echo Dot 
- apple siri
- Home automation 


## Supershoes by MIT 
- vibrating motors under the toes 
- connect wirelessly to app on smartphone 
- bluetooth device to connect with smartphone 
- microcontroller take command from app - control tickler 



## Digital assistants
- siri 
- cortana
- alexa 
- google assistant
    - google duplex 




## Heart monitor 
- employ AI/ML tools to predict cardiac arrhythmia
- dataset :  UCI Machine learning Repository dataset: https://archive.ics.uci.edu/ml/datasets/heart+Disease.
    - 76 attributes 
    - binary classification 
-  https://github.com/MohammedRashad/Deep-Learning-and-Wearable-IoT-to-Monitor-and-Predict-Cardiac-Arrhytmia


## Continuous glucose monitoring

- Hypoglycemia prediction using CGM data
- predictor based on research paper Glucose Concentration can be predicted ahead in time from Continuous glucose monitor sensor time series 
- CGM time serires glucose data 
    - model1: polynomial 
        - scikit linear regressor 
        
    - model2: first order autoregressive model 




## Human activity recognition
- camera to record human activity and classify using DL 
- wearable sensor whose data is recorded and use to predict activity



- HAR from videos
    - CNN 
    - actions : walking, jogging, running, boxing, hand waving, hand clapping 
    - image convert to 2D grayscale 
    - reduce number of frame 
    - reduce spatial resolution of individual frame 
    - model -> 3D convolutional layers

- HAR using wearable sensors
    - Applewatch 
        - ios OS 
    - smartphone sensor 
    - data ; HAR using random forest
    - dataset : Human activity recognition using smartphone on ANN
        - tria





## Resource 
- https://www.media.mit.edu/projects/supershoes/overview/
References
- https://github.com/Azure/lstms_for_predictive_maintenance/blob/master/Deep%20Learning%20Basics%20for%20Predictive%20Maintenance.ipynb
- Predictive Maintenance: Step 2A of 3, train and evaluate regression models https://gallery.cortanaintelligence.com/Experiment/Predictive-Maintenance-Step-2A-of-3-train-and-evaluate-regression-models-2
- A. Saxena and K. Goebel (2008). "Turbofan Engine Degradation Simulation Data Set", NASA Ames Prognostics Data Repository (https://ti.arc.nasa.gov/tech/dash/groups/pcoe/prognostic-data-repository/#turbofan), NASA Ames Research Center, Moffett Field, CA
- Understanding LSTM Networks http://colah.github.io/posts/2015-08-Understanding-LSTMs/