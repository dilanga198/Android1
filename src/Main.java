import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.sun.gitAndroid.R;

/**
 * Created with IntelliJ IDEA.
 * User: nimantha
 * Date: 10/7/13
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.main);

        Button b1=(Button )findViewById(R.id.button );

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this,List.class) );
            }
        });
    }
}