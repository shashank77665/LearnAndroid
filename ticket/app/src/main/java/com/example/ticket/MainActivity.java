package com.example.ticket;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText passengerNameEdt, destinationEdt, departureTimeEdt, seatNumberEdt;
    private Button addTicketBtn, showTicketsBtn;
    private DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passengerNameEdt = findViewById(R.id.EdtPassengerName);
        destinationEdt = findViewById(R.id.idEdtDestination);
        departureTimeEdt = findViewById(R.id.idEdtDepartureTime);
        seatNumberEdt = findViewById(R.id.idEdtSeatNumber);
        addTicketBtn = findViewById(R.id.idBtnAddTicket);
        showTicketsBtn = findViewById(R.id.idBtnShowTickets);
        dbHandler = new DBHandler(MainActivity.this);
        addTicketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passengerName = passengerNameEdt.getText().toString();
                String destination = destinationEdt.getText().toString();
                String departureTime = departureTimeEdt.getText().toString();
                String seatNumber = seatNumberEdt.getText().toString();
                if (passengerName.isEmpty() || destination.isEmpty() || departureTime.isEmpty() ||
                        seatNumber.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter all the data..",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                dbHandler.addNewTicket(passengerName, destination, departureTime, seatNumber);
                Toast.makeText(MainActivity.this, "Ticket has been added.",
                        Toast.LENGTH_SHORT).show();
                passengerNameEdt.setText("");
                destinationEdt.setText("");
                departureTimeEdt.setText("");
                seatNumberEdt.setText("");
            }
        });
        showTicketsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the BookingHistoryActivity when the button is clicked
                Intent intent = new Intent(MainActivity.this, BookingHistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}