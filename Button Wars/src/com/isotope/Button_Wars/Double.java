package com.isotope.Button_Wars;


import android.app.Activity;
import android.app.*;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

@SuppressWarnings("deprecation")
public class Double extends Activity {
    final Context context2 = this;
    AdView adView;
    int p1ScoreVal = 0;
    int p2ScoreVal = 0;
    //public static int lvl = 1;
    int goalScore = 4;
    int lvl = 1;
    final Context context = this;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.double_game);
        //makeAd();
        pauseListiner();
        buttonListener();
        lvlGetter();
        setScores();
        startDoubleStart();
    }

    public void startDoubleStart() {
        final Dialog dialog = new Dialog(context);
        dialog.setCancelable(false);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.doublestart);
        TextView code = (TextView) dialog.findViewById(R.id.code);
        TextView codea = (TextView) dialog.findViewById(R.id.codea);
        String lvlcode = "derp";
        switch (lvl) {
            case 1:
                lvlcode = "Level code: Versus";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 2:
                lvlcode = "Level code: Expo";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 3:
                lvlcode = "Level code: Ohm";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 4:
                lvlcode = "Level code: Crank";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 5:
                lvlcode = "Level code: Garb";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 6:
                lvlcode = "Level code: Alpha";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 7:
                lvlcode = "Level code: Wright";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 8:
                lvlcode = "Level code: Rats";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 9:
                lvlcode = "Level code: Blip";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 10:
                lvlcode = "Level code: Swagger";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 11:
                lvlcode = "Level code: Atom";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 12:
                lvlcode = "Level code: LMNOP";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 13:
                lvlcode = "Level code: Gamma";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 14:
                lvlcode = "Level code: Dub";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 15:
                lvlcode = "Level code: Junk";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 16:
                lvlcode = "Level code: Axis";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 17:
                lvlcode = "Level code: Tress";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 18:
                lvlcode = "Level code: Bad";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 19:
                lvlcode = "Level code: Wolf";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
            case 20:
                lvlcode = "Level code: Thanks";
                code.setText(lvlcode);
                codea.setText(lvlcode);
                break;
        }
        TextView goalscore = (TextView) dialog.findViewById(R.id.goalscore);
        goalscore.setText("Play to " + goalScore);
        TextView goalscorea = (TextView) dialog.findViewById(R.id.goalscorea);
        goalscorea.setText("Play to " + goalScore);
        Button dialogButton = (Button) dialog.findViewById(R.id.begin);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        Button dialogButton2 = (Button) dialog.findViewById(R.id.begina);
        dialogButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void buttonListener() {

        Button p1Plus = (Button) findViewById(R.id.p1Plus);
        p1Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonListener();
                p1ScoreVal = p1ScoreVal + 1;
                setScores();
                compareScores();
            }
        });

        Button p1Minus = (Button) findViewById(R.id.p1Minus);
        p1Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonListener();
                p2ScoreVal = p2ScoreVal - 1;
                setScores();
                compareScores();
            }
        });

        Button p2Minus = (Button) findViewById(R.id.p2Minus);
        p2Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonListener();
                p1ScoreVal = p1ScoreVal - 1;
                setScores();
                compareScores();
            }
        });

        Button p2Plus = (Button) findViewById(R.id.p2Plus);
        p2Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonListener();
                p2ScoreVal = p2ScoreVal + 1;
                setScores();
                compareScores();
            }
        });
    }

    public void setScores() {
        TextView p1Score = (TextView) findViewById(R.id.p1Score);
        TextView p1Scorea = (TextView) findViewById(R.id.p1Scorea);
        TextView p2Score = (TextView) findViewById(R.id.p2Score);
        TextView p2Scorea = (TextView) findViewById(R.id.p2Scorea);
        p1Score.setText("" + p1ScoreVal + "");
        p1Scorea.setText("" + p1ScoreVal + "");
        p2Score.setText("" + p2ScoreVal + "");
        p2Scorea.setText("" + p2ScoreVal + "");
    }

    public void compareScores() {
        int antiGoalScore = goalScore - 2 * goalScore;
        if (p1ScoreVal >= goalScore) {
            sendP1();
        } else if (p2ScoreVal >= goalScore) {
            sendP2();
        } else if (p1ScoreVal <= antiGoalScore) {
            sendP2();
        } else if (p2ScoreVal <= antiGoalScore) {
            sendP1();
        } else {
        }
    }

    public void sendP1() {
        Intent intent2 = new Intent(this, DoubleDone.class);
        intent2.putExtra("wilma", 1);    //sends who won
        intent2.putExtra("message", lvl);    //sends level to end
        startActivity(intent2);
    }

    public void sendP2() {
        Intent intent2 = new Intent(this, DoubleDone.class);
        intent2.putExtra("wilma", 0);    //sends who won
        intent2.putExtra("message", lvl);    //sends level to end
        startActivity(intent2);
    }

    public void lvlGetter() {
        Intent intent3 = getIntent();
        boolean first = intent3.getBooleanExtra("first", true);
        Intent codeIntentSingle = getIntent();
        boolean code = codeIntentSingle.getBooleanExtra("codeYes", false);
        lvl = codeIntentSingle.getIntExtra("codeLvl", 1);
        if (first) {
            if (code) {
                switch (lvl) {
                    case 1:
                        goalScore = 10;
                        break;
                    case 2:
                        goalScore = 15;
                        break;
                    case 3:
                        goalScore = 20;
                        break;
                    case 4:
                        goalScore = 25;
                        break;
                    case 5:
                        goalScore = 30;
                        break;
                    case 6:
                        goalScore = 35;
                        break;
                    case 7:
                        goalScore = 40;
                        break;
                    case 8:
                        goalScore = 45;
                        break;
                    case 9:
                        goalScore = 50;
                        break;
                    case 10:
                        goalScore = 55;
                        break;
                    case 11:
                        goalScore = 60;
                        break;
                    case 12:
                        goalScore = 65;
                        break;
                    case 13:
                        goalScore = 70;
                        break;
                    case 14:
                        goalScore = 75;
                        break;
                    case 15:
                        goalScore = 80;
                        break;
                    case 16:
                        goalScore = 85;
                        break;
                    case 17:
                        goalScore = 90;
                        break;
                    case 18:
                        goalScore = 95;
                        break;
                    case 19:
                        goalScore = 100;
                        break;
                    case 20:
                        goalScore = 105;
                        break;
                    default: //launchEndWin();
                        break;

                }

            } else {
                goalScore = 10;
            }
        } else {
            lvl = intent3.getIntExtra("theLvl", 1);

            switch (lvl) {
                case 1:
                    goalScore = 10;
                    break;
                case 2:
                    goalScore = 15;
                    break;
                case 3:
                    goalScore = 20;
                    break;
                case 4:
                    goalScore = 25;
                    break;
                case 5:
                    goalScore = 30;
                    break;
                case 6:
                    goalScore = 35;
                    break;
                case 7:
                    goalScore = 40;
                    break;
                case 8:
                    goalScore = 45;
                    break;
                case 9:
                    goalScore = 50;
                    break;
                case 10:
                    goalScore = 55;
                    break;
                case 11:
                    goalScore = 60;
                    break;
                case 12:
                    goalScore = 65;
                    break;
                case 13:
                    goalScore = 70;
                    break;
                case 14:
                    goalScore = 75;
                    break;
                case 15:
                    goalScore = 80;
                    break;
                case 16:
                    goalScore = 85;
                    break;
                case 17:
                    goalScore = 90;
                    break;
                case 18:
                    goalScore = 95;
                    break;
                case 19:
                    goalScore = 100;
                    break;
                default: //launchEndWin();
                    break;

            }
        }

    }

    public void pauseListiner() {
        Button p1Pause = (Button) findViewById(R.id.p1Pause);
        p1Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.paused);
                Button dialogButton = (Button) dialog.findViewById(R.id.close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                Button dialogButton2 = (Button) dialog.findViewById(R.id.closea);
                dialogButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button p2Pause = (Button) findViewById(R.id.p2Pause);
        p2Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.paused);
                Button dialogButton = (Button) dialog.findViewById(R.id.close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                Button dialogButton2 = (Button) dialog.findViewById(R.id.closea);
                dialogButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }

    public void makeAd() {

    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
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