package com.isotope.Button_Wars;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Single extends Activity {
    final Context context2 = this;
    int p1ScoreVal = 0;
    int p2ScoreVal = 0;
    int goalScore = 4;
    int difficulty = 1;
    int lvl = 1;
    int repeatTime = 200;
    boolean timeDecider = true;
    final Context context = this;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        lvlGetter();
        startSingleStart();
        pauseListiner();
        buttonListiner();
    }

    protected void onPause() {
        super.onPause();
        timeDecider = false;
    }

    public void startSingleStart() {
        final Dialog dialog = new Dialog(context);
        dialog.setCancelable(false);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.singlestart);
        TextView code = (TextView) dialog.findViewById(R.id.code);
        TextView goalscore = (TextView) dialog.findViewById(R.id.goalscorez);
        goalscore.setText("Play to " + goalScore);
        Button dialogButton = (Button) dialog.findViewById(R.id.begin);
        switch (lvl) {
            case 1:
                code.setText("Level code: Cake");
                break;
            case 2:
                code.setText("Level code: Robo");
                break;
            case 3:
                code.setText("Level code: Light");
                break;
            case 4:
                code.setText("Level code: Volt");
                break;
            case 5:
                code.setText("Level code: Stash");
                break;
            case 6:
                code.setText("Level code: Book");
                break;
            case 7:
                code.setText("Level code: Droid");
                break;
            case 8:
                code.setText("Level code: USA");
                break;
            case 9:
                code.setText("Level code: Idea");
                break;
            case 10:
                code.setText("Level code: USeh");
                break;
            case 11:
                code.setText("Level code: UpDown");
                break;
            case 12:
                code.setText("Level code: LeftRight");
                break;
            case 13:
                code.setText("Level code: BeeAy");
                break;
            case 14:
                code.setText("Level code: Start");
                break;
            case 15:
                code.setText("Level code: Euro");
                break;
            case 16:
                code.setText("Level code: Ruba");
                break;
            case 17:
                code.setText("Level code: Riba");
                break;
            case 18:
                code.setText("Level code: Hack");
                break;
            case 19:
                code.setText("Level code: Cont");
                break;
            case 20:
                code.setText("Level code: Fine");
                break;
        }
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repeatr();
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void pauseListiner() {
        Button p1Pause = (Button) findViewById(R.id.p1Pause);
        p1Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeDecider = false;
                final Dialog dialog = new Dialog(context);
                dialog.setCancelable(false);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.singlepause);
                Button dialogButton = (Button) dialog.findViewById(R.id.closez);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        timeDecider = true;
                        repeatr();
                    }
                });
                dialog.show();
            }
        });

    }

    public void repeatr() {
        if (timeDecider) {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    player2();
                }
            }, repeatTime);
        }
    }

    public void player2() {
        Random plus = new Random();
        Random minus = new Random();
        int plusr = plus.nextInt(2);
        int minusr = minus.nextInt(2);
        switch (difficulty) {
            case 1:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 100) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                if (minusr > 100) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                break;
            case 2:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 95) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                if (minusr > 95) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                break;
            case 3:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 90) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 90) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 4:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 85) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 85) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 5:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 80) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 80) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 6:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 75) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 75) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 7:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 70) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 70) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 8:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 65) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 65) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 9:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 60) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 60) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 10:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 55) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 55) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 11:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 50) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 50) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 12:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 45) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 45) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 13:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 40) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 40) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 14:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 35) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 35) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 15:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 30) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 30) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 16:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 25) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 25) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 17:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 20) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 20) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 18:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 15) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 15) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 19:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 10) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 10) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;
            case 20:
                plusr = plus.nextInt(200);
                minusr = minus.nextInt(200);
                if (plusr > 5) {
                    p1ScoreVal = p1ScoreVal - 1;
                }
                if (minusr > 5) {
                    p2ScoreVal = p2ScoreVal + 1;
                }
                break;

        }
        setScores();
        compareScores();
        repeatr();
    }

    public void lvlGetter() {
        Intent intent30 = getIntent();
        boolean first = intent30.getBooleanExtra("corn", true);
        Intent codeIntentSingle = getIntent();
        boolean code = codeIntentSingle.getBooleanExtra("codeYes", false);
        lvl = codeIntentSingle.getIntExtra("codeLvl", 1);
        if (first) {
            if (code) {
                switch (lvl) {
                    case 1:
                        goalScore = 10;
                        difficulty = 1;
                        repeatTime = 200;
                        break;
                    case 2:
                        goalScore = 15;
                        difficulty = 2;
                        repeatTime = 200;
                        break;
                    case 3:
                        goalScore = 20;
                        difficulty = 3;
                        break;
                    case 4:
                        goalScore = 25;
                        difficulty = 4;
                        break;
                    case 5:
                        goalScore = 30;
                        difficulty = 5;
                        break;
                    case 6:
                        goalScore = 35;
                        difficulty = 6;
                        break;
                    case 7:
                        goalScore = 40;
                        difficulty = 7;
                        break;
                    case 8:
                        goalScore = 45;
                        difficulty = 8;
                        break;
                    case 9:
                        goalScore = 50;
                        difficulty = 9;
                        break;
                    case 10:
                        goalScore = 55;
                        difficulty = 10;
                        break;
                    case 11:
                        goalScore = 60;
                        difficulty = 11;
                        break;
                    case 12:
                        goalScore = 65;
                        difficulty = 12;
                        break;
                    case 13:
                        goalScore = 70;
                        difficulty = 13;
                        break;
                    case 14:
                        goalScore = 75;
                        difficulty = 14;
                        break;
                    case 15:
                        goalScore = 80;
                        difficulty = 15;
                        break;
                    case 16:
                        goalScore = 85;
                        difficulty = 16;
                        break;
                    case 17:
                        goalScore = 90;
                        difficulty = 17;
                        break;
                    case 18:
                        goalScore = 95;
                        difficulty = 18;
                        break;
                    case 19:
                        goalScore = 100;
                        difficulty = 19;
                        break;
                    case 20:
                        goalScore = 105;
                        break;
                    default: //launchEndWin();
                        break;

                }

            } else {
                goalScore = 10;
                difficulty = 1;
            }

        } else {
            lvl = intent30.getIntExtra("theSingleLvl", 1);

            switch (lvl) {
                case 1:
                    goalScore = 10;
                    difficulty = 1;
                    repeatTime = 200;
                    break;
                case 2:
                    goalScore = 15;
                    difficulty = 2;
                    repeatTime = 200;
                    break;
                case 3:
                    goalScore = 20;
                    difficulty = 3;
                    break;
                case 4:
                    goalScore = 25;
                    difficulty = 4;
                    break;
                case 5:
                    goalScore = 30;
                    difficulty = 5;
                    break;
                case 6:
                    goalScore = 35;
                    difficulty = 6;
                    break;
                case 7:
                    goalScore = 40;
                    difficulty = 7;
                    break;
                case 8:
                    goalScore = 45;
                    difficulty = 8;
                    break;
                case 9:
                    goalScore = 50;
                    difficulty = 9;
                    break;
                case 10:
                    goalScore = 55;
                    difficulty = 10;
                    break;
                case 11:
                    goalScore = 60;
                    difficulty = 11;
                    break;
                case 12:
                    goalScore = 65;
                    difficulty = 12;
                    break;
                case 13:
                    goalScore = 70;
                    difficulty = 13;
                    break;
                case 14:
                    goalScore = 75;
                    difficulty = 14;
                    break;
                case 15:
                    goalScore = 80;
                    difficulty = 15;
                    break;
                case 16:
                    goalScore = 85;
                    difficulty = 16;
                    break;
                case 17:
                    goalScore = 90;
                    difficulty = 17;
                    break;
                case 18:
                    goalScore = 95;
                    difficulty = 18;
                    break;
                case 19:
                    goalScore = 100;
                    difficulty = 19;
                    break;
                case 20:
                    goalScore = 105;
                    break;
                default: //launchEndWin();
                    break;

            }
        }

    }

    public void buttonListiner() {
        Button plus = (Button) findViewById(R.id.p1Plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1ScoreVal = p1ScoreVal + 1;
                setScores();
                compareScores();
            }
        });
        Button minus = (Button) findViewById(R.id.p1Minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2ScoreVal = p2ScoreVal - 1;
            }
        });
    }

    public void setScores() {
        TextView p1Scorea = (TextView) findViewById(R.id.p1Scorez);
        TextView p2Scorea = (TextView) findViewById(R.id.p2Scorez);
        p1Scorea.setText("" + p1ScoreVal + "");
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
        timeDecider = false;
        Intent intent20 = new Intent(this, Done.class);
        intent20.putExtra("betty", 1);    //sends who won
        intent20.putExtra("singleLvl", lvl);    //sends level to end
        startActivity(intent20);
    }

    public void sendP2() {
        timeDecider = false;
        Intent intent20 = new Intent(this, Done.class);
        intent20.putExtra("betty", 0);    //sends who won
        intent20.putExtra("singleLvl", lvl);    //sends level to end
        startActivity(intent20);
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
        timeDecider = false;
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
