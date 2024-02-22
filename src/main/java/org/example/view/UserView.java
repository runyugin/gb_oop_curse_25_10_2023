package org.example.view;

import org.example.model.User;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}