# kotlin-dice
[Kotlin] 랜덤 주사위 `안드로이드` 앱

![dice](https://github.com/1three/kotlin-dice/assets/94810322/54482460-acc5-46c6-b449-94f82b7f63a8)

<br>

## 🪩 새롭게 알게된 점

### ✍🏻 if else 문을 when else 문으로
`if else` 문의 가독성이 떨어져 걱정하던 중, `when else` 문의 존재를 알게 되었습니다.

<br>

`if else` 문 사용 시

```Kotlin
if (leftRandom == 1) {
    leftDice.setImageResource(R.drawable.dice_1)
} else if (leftRandom == 2) {
    leftDice.setImageResource(R.drawable.dice_2)
} ...

} else {
    leftDice.setImageResource(R.drawable.dice_1)
}
```

<br>

`when else` 문 사용 시

```Kotlin
when (leftRandom) {
    1 -> leftDice.setImageResource(R.drawable.dice_1)
    2 -> leftDice.setImageResource(R.drawable.dice_2)
    // ...
    else -> leftDice.setImageResource(R.drawable.dice_1)
}
```

<br>

### 🧮 Kotlin의 Random

다른 언어에서도 Random을 사용했지만, Kotlin에서도 확인할 수 있었습니다. (범위의 끝 숫자 `-1` 기억해야겠습니다.)

```
Random.nextInt(n) : 0 ~ n-1 사이에서 정수 난수 생성
Random.nextDouble() : 0.0 ~ 0.1 사이에서 실수 난수 생성
Random.nextInt(n, m) : n ~ m-1 사이에서 정수 난수 생성
```

```Kotlin
import kotlin.random.Random

fun main() {
    val random = Random()

    // 0부터 9까지의 난수 생성
    val randomNumber = random.nextInt(10)

    // 범위 내의 임의의 실수 생성
    val randomDouble = random.nextDouble()

    // 지정한 범위 내의 임의의 정수 생성
    val randomInRange = random.nextInt(5, 10)
}
```



