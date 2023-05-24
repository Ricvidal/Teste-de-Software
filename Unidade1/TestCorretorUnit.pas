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
    [TestCase('Testar nomes inv�lidos 01', 'Ze')]
    [TestCase('Testar nomes inv�lidos 02', 'Lu')]
    [TestCase('Testar nomes inv�lidos 03', 'A')]
    [TestCase('Testar nomes inv�lidos 04', '')]
    procedure TestNomeInvalido(const ANome: string);

    [Test]
    [TestCase('Testar nomes v�lidos 01', 'Ana')]
    [TestCase('Testar nomes v�lidos 02', 'Marcelo')]
    procedure TestNomeValido(const ANome: string);

    [Test]
    [TestCase('Testar datas inv�lidas 01', '01/05/2023')]
    [TestCase('Testar datas inv�lidas 02', '26/04/2023')]
    procedure TestDataInvalida(const AData: string);

    [Test]
    [TestCase('Testar datas v�lidas 01', '01/04/2023')]
    [TestCase('Testar datas v�lidas 02', '24/04/2023')]
    procedure TestDataValida(const AData: string);

    [Test]
    [TestCase('Testar sal�rios inv�lidos 01', '999')]
    [TestCase('Testar sal�rios inv�lidos 02', '200')]
    procedure TestSalarioInvalido(const ASalario: Integer);

    [Test]
    [TestCase('Testar sal�rios v�lidos 01', '1999')]
    [TestCase('Testar sal�rios v�lidos 02', '1000')]
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
