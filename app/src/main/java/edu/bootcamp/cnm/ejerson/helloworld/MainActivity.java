package edu.bootcamp.cnm.ejerson.helloworld;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import edu.bootcamp.cnm.ejerson.helloworld.fragments.MainFragment;

public class MainActivity extends AppCompatActivity
    implements MainFragment.OnFragmentInteractionListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

  }

  @Override
  public void onFragmentInteraction(Uri uri) {

  }
}
