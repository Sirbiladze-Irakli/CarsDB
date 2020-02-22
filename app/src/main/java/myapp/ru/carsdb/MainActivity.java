package myapp.ru.carsdb;

import Data.DataBaseHandler;
import androidx.appcompat.app.AppCompatActivity;
import model.Car;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataBaseHandler dataBaseHandler = new DataBaseHandler(this);
        Log.d("CarsCount: ", String.valueOf(dataBaseHandler.getCarCount()));

//        dataBaseHandler.addCar(new Car("Toyota", "30 000 $"));
//        dataBaseHandler.addCar(new Car("Opel", "25 000 $"));
//        dataBaseHandler.addCar(new Car("Nissan", "28 000 $"));
//        dataBaseHandler.addCar(new Car("Mersedec", "50 000 $"));
//        dataBaseHandler.addCar(new Car("Mazda", "40 000 $"));
//        dataBaseHandler.addCar(new Car("Honda", "45 000 $"));
//        dataBaseHandler.addCar(new Car("KIA", "20 000 $"));
//        dataBaseHandler.addCar(new Car("Hunday", "15 000 $"));
//
        List<Car> carList = dataBaseHandler.getAllCars();
//
        for (Car car : carList) {
            Log.d("Car info ", "ID " + car.getId() + ", name " + car.getName() + ", price " + car.getPrise());
        }

//        Car delcar = dataBaseHandler.getCar(1);
//        dataBaseHandler.deleteCar(delcar);
//        Car delcar = dataBaseHandler.getCar(2);
//        dataBaseHandler.deleteCar(delcar);
//        delcar = dataBaseHandler.getCar(3);
//        dataBaseHandler.deleteCar(delcar);
//        delcar = dataBaseHandler.getCar(4);
//        dataBaseHandler.deleteCar(delcar);

//        Car car = dataBaseHandler.getCar(2);
//        Log.d("Car info ", "ID " + car.getId() + ", name " + car.getName() + ", price " + car.getPrise());
//
//        car.setName("Tesla");
//        car.setPrise("100 000 $");
//        dataBaseHandler.updateCar(car);
//
//        Log.d("Car info ", "ID " + car.getId() + ", name " + car.getName() + ", price " + car.getPrise());
//        dataBaseHandler.deleteCar();
    }
}
