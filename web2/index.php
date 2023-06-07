<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Document</title>
</head>

<body>
  <table border="1" cellpadding="10" cellspacing="0">
    <?php
    for ($i = 1; $i <= 10; $i++) {
      $warna = ($i % 2 == 0) ? "yellow" : "green";
      echo "<tr bgcolor=$warna>";
      for ($j = 1; $j <= 5; $j++) {
        echo "<td> $i,$j</td>";
      }
      echo "</tr>";
    }
    ?>

  </table>
</body>

</html>