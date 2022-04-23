package geekbrains.android.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn01 =findViewById(R.id.button01);

        btn01.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button01:
                Intent intentSecondActivity = new Intent(this, SecondActivity.class);
                startActivity(intentSecondActivity);
                break;
        }
    }
}

/*
1. Создать проект со следующими пользовательскими элементами: TextView, EditText, Button, Switch, CheckBox, ToggleButton.
Для работы использовать LinearLayout. Использовать различные шрифты, цвета, размеры, прочие атрибуты.

2. Создать ещё один макет (если не получается, то проект) с несколькими EditText, где использовать атрибут inputType:
text, textPersonName, phone, number, textPassword, textEmailAddress и другие значения.

3. Добавить в проект элемент CalendarView.

4. * Разобраться, что такое параметр ems.
 */