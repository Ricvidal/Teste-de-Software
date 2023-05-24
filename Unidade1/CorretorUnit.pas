unit CorretorUnit;

interface

uses
  System.SysUtils;

type
  TCorretor = class
  private
    FNome: string;
    FDataContratacao: TDateTime;
    FSalario: Integer;
    procedure SetNome(const Value: string);
    procedure SetDataContratacao(const Value: TDateTime);
    procedure SetSalario(const Value: Integer);
  public
    property Nome: string read FNome write SetNome;
    property DataContratacao: TDateTime read FDataContratacao write SetDataContratacao;
    property Salario: Integer read FSalario write SetSalario;
  end;

  ENomeInvalido = class(Exception)

  end;

  EDataFuturaInvalida = class(Exception)
  public
    constructor Create;
  end;

  ESalarioInvalido = class(Exception)

  end;

implementation

{ TCorretor }

procedure TCorretor.SetDataContratacao(const Value: TDateTime);
begin
  if Value <= Now then
  begin
    FDataContratacao := Value;
  end
  else
  begin
    raise EDataFuturaInvalida.Create;
  end;
end;

procedure TCorretor.SetNome(const Value: string);
begin
  if Value.Length >= 3 then
  begin
    FNome := Value;
  end
  else
  begin
    raise ENomeInvalido.Create('O nome do corretor deve ter pelo menos três letras');
  end;
end;

procedure TCorretor.SetSalario(const Value: Integer);
begin
  if Value >= 1000 then
  begin
    FSalario := Value;
  end
  else
  begin
    raise ESalarioInvalido.Create('O salário não pode ser menor que R$ 1.000,00.');
  end;
end;

{ EDataFuturaInvalida }

constructor EDataFuturaInvalida.Create;
begin
  Self.Message := 'A data de contratação não pode ser maior que a data atual';
end;

end.
