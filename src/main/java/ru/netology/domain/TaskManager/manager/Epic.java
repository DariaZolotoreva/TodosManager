package ru.netology.domain.TaskManager.manager;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {

        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtasks : subtasks) { // перебираем все задачи
            if (subtasks.contains(query)) { // если задача подходит под запрос
                return true; // добавляем её в массив ответа
            }
        }
        return false;
    }
}

