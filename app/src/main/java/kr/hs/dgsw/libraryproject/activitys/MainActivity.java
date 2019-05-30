package kr.hs.dgsw.libraryproject.activitys;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.reflect.TypeToken;

import kr.hs.dgsw.libraryproject.R;
import kr.hs.dgsw.libraryproject.databinding.ActivityMainBinding;
import kr.hs.dgsw.libraryproject.fragments.BookFragment;
import kr.hs.dgsw.libraryproject.fragments.HomeFragment;
import kr.hs.dgsw.libraryproject.fragments.LibraryFragment;
import kr.hs.dgsw.libraryproject.fragments.MyPageFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private final static int FRAGMENT_HOME = 101;
    private final static int FRAGMENT_BOOK = 102;
    private final static int FRAGMENT_LIBRARY = 103;
    private final static int FRAGMENT_MY_PAGE = 104;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Toolbar toolbar = this.binding.appBarMain.toolbar;
        setSupportActionBar(toolbar);

        DrawerLayout drawer = this.binding.drawerLayout;
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = this.binding.navView;
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        int fragment_id;

        switch (id) {
            case R.id.nav_home:
                fragment_id = FRAGMENT_HOME;
                break;
            case R.id.nav_library:
                fragment_id = FRAGMENT_LIBRARY;
                break;
            case R.id.nav_book:
                fragment_id = FRAGMENT_BOOK;
                break;
            case R.id.nav_mypage:
                fragment_id = FRAGMENT_MY_PAGE;
                break;
            default:
                return false;
        }
        switchFragment(fragment_id);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * @param fragment_id 바꿀 플래그먼트 ID, final로 지정되어 있음
     */
    private void switchFragment(int fragment_id) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction tran = fm.beginTransaction();
        Fragment fragment;
        switch (fragment_id) {
            case FRAGMENT_HOME:
                fragment = HomeFragment.newInstance();
                break;
            case FRAGMENT_BOOK:
                fragment = BookFragment.newInstance();
                break;
            case FRAGMENT_LIBRARY:
                fragment = LibraryFragment.newInstance();
                break;
            case FRAGMENT_MY_PAGE:
                fragment = MyPageFragment.newInstance();
                break;
            default:
                return;
        }
        tran.replace(R.id.fragment_main, fragment);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
        tran.commit();
    }

}
