# Jira

Jira model, processors, documentation generator

Concepts:

* User
* Project - contains Issues, Categories, Releases
* Issue - can be of multiple types - SubTask, Task, Story, Epic, Initiative, ... Can be related to other issues. May be associated with categories, releases. Some issue types may contain other issues. E.g. Story may contain sub-tasks.
* IssueSource (for advanced roadmaps) 
* Filter
* Board
* Advanced roadmaps
    * Plan
    * Program

## Implementation option

ProjectResource and ProjectResourceFactory transparently loading Jira objects as model elements. E.g. ``jira://<instance>/<project key>/#issues/<issue ID>`` to address an issue.
Proxies, proxy resolution, and overriding of MinimalEObjectImpl.dynamicGet() and ResourceImpl.getEObject() can be used to load Jira objects on demand.

## Use cases

### Educational 

Generic documentation can be used for understanding on the Jira object model. 
Jira is highly customizable and is typically customized by organizations which use it.
Such organizations may take the generic documentation and customize it to their need as well. 
This process can be multi-step[^1] - a central function in an organization may publish org-wide custom documentation, org-units may further specialize documentation to their needs.

[^1]: See [TOGAF Enterprise Continuum](https://pubs.opengroup.org/togaf-standard/introduction/chap03.html#tag_03_10)

### Architecture repository

Jira objects can be loaded and cross-referenced with internal organization objects, e.g. people hierarchy, assets inventory, etc.


## Resources

* https://www.baeldung.com/jira-rest-api - an old article explaining how to use Jira Java API
* https://mvnrepository.com/artifact/com.atlassian.jira/jira-rest-java-client-api/5.2.7 - Jira client in Maven Central
* [Javadoc](https://javadoc.io/doc/com.atlassian.jira/jira-rest-java-client-api/latest/index.html) 