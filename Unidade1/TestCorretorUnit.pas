unit TestCorretorUnit;

interface

uses
  DUnitX.TestFramework, CorretorUnit;

type

  [TestFixture]
  TTestCorretor = class
  private
    corretor: TCorretor;
  public
    [Setup]
    procedure Setup;
    [TearDown]
    procedure TearDown;
    [Test]
    [TestCase('Testar nomes inválidos 01', 'Ze')]
    [TestCase('Testar nomes inválidos 02', 'Lu')]
    [TestCase('Testar nomes inválidos 03', 'A')]
    [TestCase('Testar nomes inválidos 04', '')]
    procedure TestNomeInvalido(const ANome: string);

    [Test]
    [TestCase('Testar nomes válidos 01', 'Ana')]
    [TestCase('Testar nomes válidos 02', 'Marcelo')]
    procedure TestNomeValido(const ANome: string);

    [Test]
    [TestCase('Testar datas inválidas 01', '01/05/2023')]
    [TestCase('Testar datas inválidas 02', '26/04/2023')]
    procedure TestDataInvalida(const AData: string);

    [Test]
    [TestCase('Testar datas válidas 01', '01/04/2023')]
    [TestCase('Testar datas válidas 02', '24/04/2023')]
    procedure TestDataValida(const AData: string);

    [Test]
    [TestCase('Testar salários inválidos 01', '999')]
    [TestCase('Testar salários inválidos 02', '200')]
    procedure TestSalarioInvalido(const ASalario: Integer);

    [Test]
    [TestCase('Testar salários válidos 01', '1999')]
    [TestCase('Testar salários válidos 02', '1000')]
    procedure TestSalarioValido(const  ASalario: Integer);

  end;

implementation

uses
  System.SysUtils;

procedure TTestCorretor.Setup;
begin
  corretor := TCorretor.Create;
end;

procedure TTestCorretor.TearDown;
begin
  corretor.Free;
end;

procedure TTestCorretor.TestNomeValido(const ANome: string);
begin
  Assert.WillNotRaise(
    procedure
    begin
      corretor.Nome := ANome;
    end, ENomeInvalido);
end;

procedure TTestCorretor.TestSalarioInvalido(const ASalario: Integer);
begin
  Assert.WillRaise(
    procedure
    begin
      corretor.Salario := ASalario;
    end, ESalarioInvalido);
end;

procedure TTestCorretor.TestSalarioValido(const ASalario: Integer);
begin
  Assert.WillNotRaise(
    procedure
    begin
      corretor.Salario := ASalario;
    end, ESalarioInvalido);
end;

procedure TTestCorretor.TestDataInvalida(const AData: string);
begin
  Assert.WillRaise(
    procedure
    begin
      corretor.DataContratacao := StrToDateTime(AData);
    end, EDataFuturaInvalida);
end;

procedure TTestCorretor.TestDataValida(const AData: string);
begin
  Assert.WillNotRaise(
    procedure
    begin
      corretor.DataContratacao := StrToDateTime(AData);
    end, EDataFuturaInvalida);
end;

procedure TTestCorretor.TestNomeInvalido(const ANome: string);
begin
  Assert.WillRaise(
    procedure
    begin
      corretor.Nome := ANome;
    end, ENomeInvalido);
end;

initialization

TDUnitX.RegisterTestFixture(TTestCorretor);

end.
