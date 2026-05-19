
vida_enemigo = 40
ataque = 35
nivel_jugador = 6

if nivel_jugador >= 5:
    bonificacion = 10
else:
    bonificacion = 0

dano_total = ataque + bonificacion
vida_restante = vida_enemigo - dano_total

print(f"=== REPORTE DE COMBATE ===")
print(f"Daño infligido: {dano_total} (Ataque: {ataque} + Bono: {bonificacion})")

if vida_restante <= 0:
    print("Enemigo derrotado! +50 XP")
elif vida_restante <= 20:
    print("Enemigo en estado critico")
else:
    print(f"Enemigo resiste. Vida restante: {vida_restante}")