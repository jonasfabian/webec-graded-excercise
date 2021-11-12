# webeC - Graded Exercise

## Project

### Team members

Jonas Fabian - jonas.fabian@students.fhnw.ch
Adrian Wilhelm - adrian.wilhelm@students.fhnw.ch

### Topic

Kanban Board

### Description

We want to create an app, where the users could create boards for their project that reflects the tasks they have to do to complete it.
The tasks can be moved between different stages.
Optionally...
- ... the tasks can be labeled to group task together
- ... relationships between the tasks can be created

To do this the entities that we intend to create are following:
- KanbanBoard - Boards are collections of stages and labels
- KanbanStage - A stage groups tasks by the state of the task
- KanbanTask - A task has the information about a task
- KanbanLabel - Labels can be assign to task to group them together
- KanbanRelation - Relations are used to indicate which tasks are related on which other tasks and how they are related (BLOCK, CLONE, RELATION, REFERENCE)

### Extras

TODO: write the extras you aim for here (at max 3)

- CI Pipeline
- Theme Switcher

## Installation and run instructions

```
gradle build
docker-compose up -d
```

### Run tests

```
# For UNIX
CI=true gradle test
# For Windows
SET CI=true gradle test
```

### Miro

https://miro.com/app/board/o9J_llf3tBA=/
