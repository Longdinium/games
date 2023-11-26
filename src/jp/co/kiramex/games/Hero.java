package jp.co.kiramex.games;

public class Hero extends Character {
    private int weapon; // 武器の強さ

    // getter
    public int getWeapon() {
        return weapon;
    }

    // setter
    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    // 引数なしのコンストラクタ
    public Hero() {
    }

}
