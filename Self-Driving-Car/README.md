# Tesla Neural Network at scale in production 

<a href="https://imgur.com/vAZevZC"><img src="https://i.imgur.com/vAZevZC.png" title="source: imgur.com" /></a>

# AI for full self driving 
- Real computer with cameras on it 
- active safely - auto detect pedestrians for self driving mode is off 
- auto parking - auto search for the parking lot 
- Vision based approach 

<a href="https://imgur.com/71Ro739"><img src="https://i.imgur.com/71Ro739.png" title="source: imgur.com" /></a>


## HydraNet 
- large network for detect objects that car encounter on the street 
<a href="https://imgur.com/COgLiOC"><img src="https://i.imgur.com/COgLiOC.png" title="source: imgur.com" /></a>


## Data engine and operation vacation
- `Operation vacation`
- `Data Engine`

<a href="https://imgur.com/emWP0Sa"><img src="https://i.imgur.com/emWP0Sa.png" title="source: imgur.com" /></a>


## task detecting `caution-lights`
- Label a seed set of images
- Develop a seed set of unit tests
- Train network head on current data 
- While QA does not sign off:
    - While unit tests fail:
        - Deploy a trigger(an offline trained approximate detector) 
          to the fleet(millions of Tesla car running on the street) 
          in order to source more images in failing scenarios. 
        - Label the resulting images and incorporate them into the training set.
        - Retrain network on data 
        - Enrich/grow set of unit tests
    - Deploy to run on the FSD computer
    - (Optional) Deploy to the fleet in shadow mode
    - Collect telemetry and evaluate the performance of the feature
- Ship feature



## Evaluation metrics

<a href="https://imgur.com/jT8MF3A"><img src="https://i.imgur.com/jT8MF3A.png" title="source: imgur.com" /></a>

## Modeling: Bird's Eye View networks
- `occupancy tracker`
- `Fushion layer`
- `Temporal module`
- `BEV Net`






## Resource 
- https://info.matroid.com/scaledml-media-archive-preview
