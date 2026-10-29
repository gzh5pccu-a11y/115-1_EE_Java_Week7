# Use .set noreorder to prevent the assembler from filling branch
# delay slots, if you want to fill delay slots manually.
# .set noreorder

.set noreorder

.data
A:
    .word 10, 20, 30, 40, 50, 60, 70, 80, 90

.text
.global _start

_start:
    jal  main
    nop

    li   $v0, 10
    syscall

main:
    addi $s2, $zero, 20    # h = 20

    la   $s3, A            # $s3 = base address of A

    lw   $t0, 32($s3)      # $t0 = A[8]
    add  $s1, $s2, $t0     # g = h + A[8]

    jr   $ra
    nop