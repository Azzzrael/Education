package pp1;

import javax.swing.*; //подтягиваем всю библиотеку.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    JTextField email_field, name_field;
    JRadioButton male, female;
    JCheckBox check;

    public ContactForm() {
        super("Feedback"); //надпись вверху
        super.setBounds(500, 500, 300, 230); // расположение приложения на экране
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//что будет происходить если закрыть приложение. Проэкт останавливается при выходе\

        Container container = super.getContentPane(); // создаем контейнер
        container.setLayout(new GridLayout(5, 2, 10, 10)); // в какой системе будет располагаться.Выбираем сетки

        JLabel name = new JLabel("Введите имя");//надпись внутри окна
        name_field = new JTextField("", 1);
        JLabel email = new JLabel("Введите email");//надпись внутри окна
        email_field = new JTextField("", 1);

        container.add(name); //добавляем объект в контейнер
        container.add(name_field); //добавляем объект в контейнер
        container.add(email); //добавляем объект в контейнер
        container.add(email_field); //добавляем объект в контейнер

        male = new JRadioButton("Мужской");//создаем кнопку пол. Просто кнопка
        female = new JRadioButton("Женский");//создаем кнопку пол. Просто кнопка
        check = new JCheckBox("Согласен", false);//кнопка флажочек
        JButton send_button = new JButton("Отправить"); // кнопка отправки (в которой происходит действие)

        male.setSelected(true);  // Ставим значение по умолчанию. мужской пол
        container.add(male); //добавляем объект в контейнер
        container.add(female); //добавляем объект в контейнер

        ButtonGroup group = new ButtonGroup(); // кнопки нужно добавлять группой. по этому создаем группу кнопок, выделяем под них память
        group.add(male); // добавляем кнопку в группу
        group.add(female); // добавляем кнопку в группу

        container.add(check); //добавляем кнопки в контейнер напрямую
        container.add(send_button); //добавляем кнопки в контейнер напрямую

        send_button.addActionListener(new ButtonEventManager());// создаем обработчик событий

    }

    class ButtonEventManager implements ActionListener { // наследует все от метода ActionListener

        @Override
        public void actionPerformed(ActionEvent e) { //вызываеться каждый раз при нажатии кнопки
            String name = name_field.getText(); //получаем данные из поля
            String email = email_field.getText(); //получаем данные из поля

            String isMale = "Мужской";
            if (!male.isSelected()) {
                isMale = "Женский";     //проверка на пол. если не мужской то выбираеться женский
            }
            boolean checkBox = check.isSelected(); // тру если галочка поставлена, фолс если не стоит галочка
            if (!checkBox) {
                JOptionPane.showMessageDialog(null, "Вы не поставили галочку", "Привет, " + name, JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ваша почта: " + email + " Ваш пол: " + isMale
                        , "Привет, " + name, JOptionPane.PLAIN_MESSAGE); //всплывающее окно  / PLAIN_MESSAGE - обычное сообщение
            }
        }

    }
}
