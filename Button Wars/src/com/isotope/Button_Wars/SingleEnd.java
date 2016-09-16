package com.isotope.Button_Wars;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SingleEnd extends Activity {
    final Context context2 = this;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_end);
        buttonListiner();
    }

    public void buttonListiner() {
        Button nextm = (Button) findViewById(R.id.restart);
        nextm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
            }
        });
        Button rematch = (Button) findViewById(R.id.rematchb);
        rematch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSameLvl();
            }
        });
    }

    public void restart() {
        Intent restart = new Intent(this, Welcome.class);
        startActivity(restart);
    }

    public void sendSameLvl() {
        Intent intentEnd = getIntent();
        int lvl = intentEnd.getIntExtra("message", 0);
        Intent intent3 = new Intent(this, Double.class);
        intent3.putExtra("first", false);
        intent3.putExtra("theLvl", lvl);
        startActivity(intent3);
    }

    public void goHome() {
        Intent goHome = new Intent(this, Welcome.class);
        startActivity(goHome);
    }

    public void codeSender(int value) {
        Intent codeIntentSingle = new Intent(this, Single.class);
        Intent codeIntentDouble = new Intent(this, Double.class);
        switch (value) {
            case 1:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 2:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 3:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 4:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 5:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 6:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 7:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 8:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 9:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 10:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 11:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 12:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 13:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 14:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 15:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 16:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 17:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 18:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 19:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 20:
                codeIntentSingle.putExtra("codeLvl", value);
                codeIntentSingle.putExtra("codeYes", true);
                startActivity(codeIntentSingle);
                break;
            case 21:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 22:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 23:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 24:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 25:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 26:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 27:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 28:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 29:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 30:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 31:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 32:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 33:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 34:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 35:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 36:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 37:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 38:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 39:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;
            case 40:
                codeIntentDouble.putExtra("codeLvl", value - 20);
                codeIntentDouble.putExtra("codeYes", true);
                startActivity(codeIntentDouble);
                break;

        }
    }

    public void showCode() {
        final EditText lvlCode = new EditText(this);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context2);
        alertDialogBuilder.setTitle("Level Code");
        alertDialogBuilder
                .setCancelable(false)
                .setView(lvlCode)
                .setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String code = lvlCode.getText().toString();
                        if (code.equalsIgnoreCase("cake")) {
                            codeSender(1);
                        } else if (code.equalsIgnoreCase("robo")) {
                            codeSender(2);
                        } else if (code.equalsIgnoreCase("light")) {
                            codeSender(3);
                        } else if (code.equalsIgnoreCase("volt")) {
                            codeSender(4);
                        } else if (code.equalsIgnoreCase("stash")) {
                            codeSender(5);
                        } else if (code.equalsIgnoreCase("book")) {
                            codeSender(6);
                        } else if (code.equalsIgnoreCase("droid")) {
                            codeSender(7);
                        } else if (code.equalsIgnoreCase("usa")) {
                            codeSender(8);
                        } else if (code.equalsIgnoreCase("idea")) {
                            codeSender(9);
                        } else if (code.equalsIgnoreCase("useh")) {
                            codeSender(10);
                        } else if (code.equalsIgnoreCase("updown")) {
                            codeSender(11);
                        } else if (code.equalsIgnoreCase("leftright")) {
                            codeSender(12);
                        } else if (code.equalsIgnoreCase("beeay")) {
                            codeSender(13);
                        } else if (code.equalsIgnoreCase("start")) {
                            codeSender(14);
                        } else if (code.equalsIgnoreCase("euro")) {
                            codeSender(15);
                        } else if (code.equalsIgnoreCase("ruba")) {
                            codeSender(16);
                        } else if (code.equalsIgnoreCase("riba")) {
                            codeSender(17);
                        } else if (code.equalsIgnoreCase("hack")) {
                            codeSender(18);
                        } else if (code.equalsIgnoreCase("cont")) {
                            codeSender(19);
                        } else if (code.equalsIgnoreCase("fine")) {
                            codeSender(20);
                        } else if (code.equalsIgnoreCase("versus")) {
                            codeSender(21);
                        } else if (code.equalsIgnoreCase("expo")) {
                            codeSender(22);
                        } else if (code.equalsIgnoreCase("ohm")) {
                            codeSender(23);
                        } else if (code.equalsIgnoreCase("crank")) {
                            codeSender(24);
                        } else if (code.equalsIgnoreCase("garb")) {
                            codeSender(25);
                        } else if (code.equalsIgnoreCase("alpha")) {
                            codeSender(26);
                        } else if (code.equalsIgnoreCase("wright")) {
                            codeSender(27);
                        } else if (code.equalsIgnoreCase("rats")) {
                            codeSender(28);
                        } else if (code.equalsIgnoreCase("blip")) {
                            codeSender(29);
                        } else if (code.equalsIgnoreCase("swagger")) {
                            codeSender(30);
                        } else if (code.equalsIgnoreCase("atom")) {
                            codeSender(31);
                        } else if (code.equalsIgnoreCase("lmnop")) {
                            codeSender(32);
                        } else if (code.equalsIgnoreCase("gamma")) {
                            codeSender(33);
                        } else if (code.equalsIgnoreCase("dub")) {
                            codeSender(34);
                        } else if (code.equalsIgnoreCase("junk")) {
                            codeSender(35);
                        } else if (code.equalsIgnoreCase("axis")) {
                            codeSender(36);
                        } else if (code.equalsIgnoreCase("tress")) {
                            codeSender(37);
                        } else if (code.equalsIgnoreCase("bad")) {
                            codeSender(38);
                        } else if (code.equalsIgnoreCase("wolf")) {
                            codeSender(39);
                        } else if (code.equalsIgnoreCase("thanks")) {
                            codeSender(40);
                        }

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.layout.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:
                goHome();
                return true;
            case R.id.menu_list:
                showCode();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, Welcome.class));
        finish();

    }
}