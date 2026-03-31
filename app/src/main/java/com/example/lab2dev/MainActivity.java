package com.example.lab2dev;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Déclaration des éléments de l'interface
    private EditText surfaceInput, piecesInput, nomInput, adresseInput;
    private CheckBox piscineCheckbox;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison XML <-> Java
        nomInput = findViewById(R.id.input_nom);
        adresseInput = findViewById(R.id.input_adresse);
        surfaceInput = findViewById(R.id.input_surface);
        piecesInput = findViewById(R.id.input_pieces);
        piscineCheckbox = findViewById(R.id.checkbox_piscine);
        resultView = findViewById(R.id.result);

        // Écouteur du bouton "Calculer"
        findViewById(R.id.button_calcul).setOnClickListener(v -> calculer());
    }

    private void calculer() {
        try {
            // Lecture des valeurs saisies
            String surfaceStr = surfaceInput.getText().toString();
            String piecesStr = piecesInput.getText().toString();

            if (surfaceStr.isEmpty() || piecesStr.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                return;
            }

            double surface = Double.parseDouble(surfaceStr);
            int pieces = Integer.parseInt(piecesStr);
            boolean piscine = piscineCheckbox.isChecked();

            // Calcul des impôts
            double impotBase = surface * 2;
            double supplement = pieces * 50 + (piscine ? 100 : 0);
            double total = impotBase + supplement;

            // Affichage du résultat (formaté comme dans la capture)
            String resultat = "Impôt de base : " + impotBase + "\n" +
                              "impôt supplémentaire : " + supplement + "\n" +
                              "impôt Total : " + total + " DH";
            
            resultView.setText(resultat);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Erreur de saisie numérique", Toast.LENGTH_SHORT).show();
        }
    }
}