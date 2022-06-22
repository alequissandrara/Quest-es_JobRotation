e = ['SP', 'RJ', 'MG', 'ES', 'OUTROS']

faturamento = list()
for c in e:

    while True:
        try:
            v = float(input(f'Digite o faturamento mensal de {c}: '))
            if v < 0:
                print(
                    '\033[31mValor INVÁLIDO! Digite apenas valores maiores ou iguais a "0":\033[m'
                )
            break
        except:
            print('\033[31mValor INVÁLIDO! Digite apenas valores reais!\033[m')

    faturamento.append(v)

faturamento_total = sum(faturamento)
print(
    f'\033[32mO faturamento total da Distribuidora foi: R$ {faturamento_total:.2f}'
    .replace('.', ','))

cont = 0
for i in faturamento:
    cont += 1
    percentual = ((i / faturamento_total) * 100)
    print(
        f'O percentual de faturamento de {e[cont - 1]} é: {percentual:.2f} %')
