# Welcome to my repo _yesiknowjavafx_
--**(This repo is use to keep track of my progress learning javafx.)**

### **Javafx is the Next Generation Framework for Developing GUI Applications with Java**.  
 I started looking into javafx when it first came out, but to be honest I was not a big fan of the scripting language and the way I had to compile and run the application. I just felt it wasn't very intuitive nor user friendly. After playing around these past couple of weeks with javafx I can honestly say that I'm actually quite impress. Javafx has an amazing enhancement that is the automation of the repaint process. With several enhance features and no being   is the successor of the Swing GUI framework.

### Following are some features that makes Javafx awesome:
 * Written as a Java API allows for access to other Java Applications
 * Uses the Model View Controller architecture
 * Supports the use of Cascading Style Sheet and FXML to style and build the GUI
 * Is backward compatible with Swing
 * Javafx provides all major UI controls for a full feature applications
 * High-performance hardware and accelerated graphics pipeline
 * High-performance media engine
 * Integrates with other JVM-based scripting languages
 * Comes already install with the Java Run Environment
 * A scene graph engine

### Javafx architecture
 1. Javafx Public APIs and Scene Graph  
 2. Quantum Toolkit
 3. Prism, Glass Window Toolkit, Media Engine, Web Engine
 4. Java 2D, OpenGL, D3D
 5. JDK API libraries and tools
 6. JVM

### Three Major Threads in a Javafx Application
1. Application Threads - the primary thread used to deploy the application (different from the Swing and AWT event dispatch thread)
2. Prism Render Thread - separates the handling of rendering from the handling event dispatch.
3. Media Thread - synchronizes the latest frames through the scene graph by using the application thread.

_Note: If some processing requires extensive time is better to run a concurrent thread in the background by using the Javafx.concurrent package._

### Javafx Scene Graph
* Illustrates a hierarchical tree of nodes
* Each element in the scene graph is called a node
  * Nodes have: An ID, style class, and bounding volume
* Root node cannot have a parent node
* All other nodes have a parent and zero or more childe nodes

### Benefits of using a scene graph is that each node has the following:
* Effects
* Blurs and shadows
* Varying Opacity
* Transformations
* Event handlers
* Applications-specific states

### Javafx Scene Graph API Nodes Include Many features
* Ability for adding shapes 2D and 3D,
* Images
* Media
* Text
* UI controls
* Groups
* Charts
* Containers
* Embedded Web Browsers

Overall I've found Javafx applicatoins very fun to code. I'm very impress with the performance, look and feel, how easy is to learn, implement, and integrate with other Java APIs.

Author: [Antonio Rios](www.linkedin.com/antonioriosjr)
