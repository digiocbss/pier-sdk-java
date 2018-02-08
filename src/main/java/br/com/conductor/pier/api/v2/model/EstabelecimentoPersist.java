package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ConsultaCadastroEstabelecimentoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Par\u00C3\u00A2metros de requisi\u00C3\u00A7\u00C3\u00A3o de um estabelecimento
 **/

@ApiModel(description = "Par\u00C3\u00A2metros de requisi\u00C3\u00A7\u00C3\u00A3o de um estabelecimento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EstabelecimentoPersist   {
  
  private Integer flagMatriz = null;
  private Long idCredor = null;
  private String numeroReceitaFederal = null;
  private String nome = null;
  private String descricao = null;
  private String nomeFantasia = null;
  private String cep = null;
  private String nomeLogradouro = null;
  private Integer numeroEndereco = null;
  private String bairro = null;
  private String cidade = null;
  private String complemento = null;
  private String uf = null;
  private String cep2 = null;
  private String nomeLogradouro2 = null;
  private Integer numeroEndereco2 = null;
  private String bairro2 = null;
  private String cidade2 = null;
  private String complemento2 = null;
  private String uf2 = null;
  private String obs = null;
  private String contato = null;
  private String email = null;
  private Integer flagArquivoSecrFazenda = null;
  private Integer flagCartaoDigitado = null;
  private Integer inativo = null;
  private Long idMoeda = null;
  private Long idPais = null;
  private Integer associadoSPCBrasil = null;
  private Long mcc = null;
  private Long idTipoEstabelecimento = null;


  public enum TipoCorrespondenciaEnum {
    ORIGEM("ORIGEM"),
    CORRESPONDENCIA("CORRESPONDENCIA");

    private String value;

    TipoCorrespondenciaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoCorrespondenciaEnum tipoCorrespondencia = null;
  private String cargoContato = null;


  public enum TipoPagamentoEnum {
    CENTRALIZADO("CENTRALIZADO"),
    PV("PV");

    private String value;

    TipoPagamentoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoPagamentoEnum tipoPagamento = null;
  private ConsultaCadastroEstabelecimentoDTO consulta = null;
  private ConsultaCadastroEstabelecimentoDTO consulta2 = null;
  private ConsultaCadastroEstabelecimentoDTO consulta3 = null;
  private Boolean flagTerminalVirtual = null;
  private Boolean flagConsultaExtrato = null;

  
  /**
   * Indica se \u00C3\u00A9 matriz ou filial.
   **/
  public EstabelecimentoPersist flagMatriz(Integer flagMatriz) {
    this.flagMatriz = flagMatriz;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se \u00C3\u00A9 matriz ou filial.")
  @JsonProperty("flagMatriz")
  public Integer getFlagMatriz() {
    return flagMatriz;
  }
  public void setFlagMatriz(Integer flagMatriz) {
    this.flagMatriz = flagMatriz;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Credor.
   **/
  public EstabelecimentoPersist idCredor(Long idCredor) {
    this.idCredor = idCredor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Credor.")
  @JsonProperty("idCredor")
  public Long getIdCredor() {
    return idCredor;
  }
  public void setIdCredor(Long idCredor) {
    this.idCredor = idCredor;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Receita Federal.
   **/
  public EstabelecimentoPersist numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Receita Federal.")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Nome do Estabelecimento.
   **/
  public EstabelecimentoPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Estabelecimento.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Raz\u00C3\u00A3o Social do Estabelecimento.
   **/
  public EstabelecimentoPersist descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raz\u00C3\u00A3o Social do Estabelecimento.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * T\u00C3\u00ADtulo Comercial do Estabelecimento.
   **/
  public EstabelecimentoPersist nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "T\u00C3\u00ADtulo Comercial do Estabelecimento.")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).
   **/
  public EstabelecimentoPersist cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Nome do Logradouro.
   **/
  public EstabelecimentoPersist nomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Logradouro.")
  @JsonProperty("nomeLogradouro")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * N\u00C3\u00BAmero do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist numeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do endere\u00C3\u00A7o.")
  @JsonProperty("numeroEndereco")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Nome do bairro do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do bairro do endere\u00C3\u00A7o.")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Nome da cidade do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da cidade do endere\u00C3\u00A7o.")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).
   **/
  public EstabelecimentoPersist cep2(String cep2) {
    this.cep2 = cep2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).")
  @JsonProperty("cep2")
  public String getCep2() {
    return cep2;
  }
  public void setCep2(String cep2) {
    this.cep2 = cep2;
  }

  
  /**
   * Nome do Logradouro .
   **/
  public EstabelecimentoPersist nomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Logradouro .")
  @JsonProperty("nomeLogradouro2")
  public String getNomeLogradouro2() {
    return nomeLogradouro2;
  }
  public void setNomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
  }

  
  /**
   * N\u00C3\u00BAmero do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist numeroEndereco2(Integer numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do endere\u00C3\u00A7o.")
  @JsonProperty("numeroEndereco2")
  public Integer getNumeroEndereco2() {
    return numeroEndereco2;
  }
  public void setNumeroEndereco2(Integer numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
  }

  
  /**
   * Nome do bairro do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist bairro2(String bairro2) {
    this.bairro2 = bairro2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do bairro do endere\u00C3\u00A7o.")
  @JsonProperty("bairro2")
  public String getBairro2() {
    return bairro2;
  }
  public void setBairro2(String bairro2) {
    this.bairro2 = bairro2;
  }

  
  /**
   * Nome da cidade do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist cidade2(String cidade2) {
    this.cidade2 = cidade2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da cidade do endere\u00C3\u00A7o.")
  @JsonProperty("cidade2")
  public String getCidade2() {
    return cidade2;
  }
  public void setCidade2(String cidade2) {
    this.cidade2 = cidade2;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist complemento2(String complemento2) {
    this.complemento2 = complemento2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.")
  @JsonProperty("complemento2")
  public String getComplemento2() {
    return complemento2;
  }
  public void setComplemento2(String complemento2) {
    this.complemento2 = complemento2;
  }

  
  /**
   * Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoPersist uf2(String uf2) {
    this.uf2 = uf2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.")
  @JsonProperty("uf2")
  public String getUf2() {
    return uf2;
  }
  public void setUf2(String uf2) {
    this.uf2 = uf2;
  }

  
  /**
   * Detalhes espec\u00C3\u00ADficos quanto ao Cadastro do Estabelecimento.
   **/
  public EstabelecimentoPersist obs(String obs) {
    this.obs = obs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detalhes espec\u00C3\u00ADficos quanto ao Cadastro do Estabelecimento.")
  @JsonProperty("obs")
  public String getObs() {
    return obs;
  }
  public void setObs(String obs) {
    this.obs = obs;
  }

  
  /**
   * Nome da pessoa para contato com o Estabelecimento.
   **/
  public EstabelecimentoPersist contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da pessoa para contato com o Estabelecimento.")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * E-mail da pessoa para contato com o Estabelecimento.
   **/
  public EstabelecimentoPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "E-mail da pessoa para contato com o Estabelecimento.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indica se o estabelecimento ser\u00C3\u00A1 inclu\u00C3\u00ADdo no arquivo de registro para a Secretaria da Fazenda Estadual.
   **/
  public EstabelecimentoPersist flagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o estabelecimento ser\u00C3\u00A1 inclu\u00C3\u00ADdo no arquivo de registro para a Secretaria da Fazenda Estadual.")
  @JsonProperty("flagArquivoSecrFazenda")
  public Integer getFlagArquivoSecrFazenda() {
    return flagArquivoSecrFazenda;
  }
  public void setFlagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
  }

  
  /**
   * Indica se o estabelecimento poder\u00C3\u00A1 originar transa\u00C3\u00A7\u00C3\u00B5es sem a leitura da tarja ou do chip do cart\u00C3\u00A3o.
   **/
  public EstabelecimentoPersist flagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o estabelecimento poder\u00C3\u00A1 originar transa\u00C3\u00A7\u00C3\u00B5es sem a leitura da tarja ou do chip do cart\u00C3\u00A3o.")
  @JsonProperty("flagCartaoDigitado")
  public Integer getFlagCartaoDigitado() {
    return flagCartaoDigitado;
  }
  public void setFlagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
  }

  
  /**
   * Indica se o estabelecimento est\u00C3\u00A1 inativo.
   **/
  public EstabelecimentoPersist inativo(Integer inativo) {
    this.inativo = inativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o estabelecimento est\u00C3\u00A1 inativo.")
  @JsonProperty("inativo")
  public Integer getInativo() {
    return inativo;
  }
  public void setInativo(Integer inativo) {
    this.inativo = inativo;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da moeda.
   **/
  public EstabelecimentoPersist idMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da moeda.")
  @JsonProperty("idMoeda")
  public Long getIdMoeda() {
    return idMoeda;
  }
  public void setIdMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
  }

  
  /**
   * Identificador de Pa\u00C3\u00ADs.
   **/
  public EstabelecimentoPersist idPais(Long idPais) {
    this.idPais = idPais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador de Pa\u00C3\u00ADs.")
  @JsonProperty("idPais")
  public Long getIdPais() {
    return idPais;
  }
  public void setIdPais(Long idPais) {
    this.idPais = idPais;
  }

  
  /**
   * N\u00C3\u00BAmero do associado ao SPCBrasil.
   **/
  public EstabelecimentoPersist associadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do associado ao SPCBrasil.")
  @JsonProperty("associadoSPCBrasil")
  public Integer getAssociadoSPCBrasil() {
    return associadoSPCBrasil;
  }
  public void setAssociadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
  }

  
  /**
   * C\u00C3\u00B3digo de Categoria de Mercado.
   **/
  public EstabelecimentoPersist mcc(Long mcc) {
    this.mcc = mcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Categoria de Mercado.")
  @JsonProperty("mcc")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento.
   **/
  public EstabelecimentoPersist idTipoEstabelecimento(Long idTipoEstabelecimento) {
    this.idTipoEstabelecimento = idTipoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento.")
  @JsonProperty("idTipoEstabelecimento")
  public Long getIdTipoEstabelecimento() {
    return idTipoEstabelecimento;
  }
  public void setIdTipoEstabelecimento(Long idTipoEstabelecimento) {
    this.idTipoEstabelecimento = idTipoEstabelecimento;
  }

  
  /**
   * Tipo da Correspond\u00C3\u00AAncia (ORIGEM, CORRESPONDENCIA).
   **/
  public EstabelecimentoPersist tipoCorrespondencia(TipoCorrespondenciaEnum tipoCorrespondencia) {
    this.tipoCorrespondencia = tipoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo da Correspond\u00C3\u00AAncia (ORIGEM, CORRESPONDENCIA).")
  @JsonProperty("tipoCorrespondencia")
  public TipoCorrespondenciaEnum getTipoCorrespondencia() {
    return tipoCorrespondencia;
  }
  public void setTipoCorrespondencia(TipoCorrespondenciaEnum tipoCorrespondencia) {
    this.tipoCorrespondencia = tipoCorrespondencia;
  }

  
  /**
   * Cargo do contato do estabelecimento.
   **/
  public EstabelecimentoPersist cargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cargo do contato do estabelecimento.")
  @JsonProperty("cargoContato")
  public String getCargoContato() {
    return cargoContato;
  }
  public void setCargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
  }

  
  /**
   * Tipo do regime de pagamento do estabelecimento.
   **/
  public EstabelecimentoPersist tipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do regime de pagamento do estabelecimento.")
  @JsonProperty("tipoPagamento")
  public TipoPagamentoEnum getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   * Consulta de cadastro n\u00C3\u00BAmero um.
   **/
  public EstabelecimentoPersist consulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Consulta de cadastro n\u00C3\u00BAmero um.")
  @JsonProperty("consulta")
  public ConsultaCadastroEstabelecimentoDTO getConsulta() {
    return consulta;
  }
  public void setConsulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
  }

  
  /**
   * Consulta de cadastro n\u00C3\u00BAmero um.
   **/
  public EstabelecimentoPersist consulta2(ConsultaCadastroEstabelecimentoDTO consulta2) {
    this.consulta2 = consulta2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Consulta de cadastro n\u00C3\u00BAmero um.")
  @JsonProperty("consulta2")
  public ConsultaCadastroEstabelecimentoDTO getConsulta2() {
    return consulta2;
  }
  public void setConsulta2(ConsultaCadastroEstabelecimentoDTO consulta2) {
    this.consulta2 = consulta2;
  }

  
  /**
   * Consulta de cadastro n\u00C3\u00BAmero um.
   **/
  public EstabelecimentoPersist consulta3(ConsultaCadastroEstabelecimentoDTO consulta3) {
    this.consulta3 = consulta3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Consulta de cadastro n\u00C3\u00BAmero um.")
  @JsonProperty("consulta3")
  public ConsultaCadastroEstabelecimentoDTO getConsulta3() {
    return consulta3;
  }
  public void setConsulta3(ConsultaCadastroEstabelecimentoDTO consulta3) {
    this.consulta3 = consulta3;
  }

  
  /**
   * Flag indicando se o terminal \u00C3\u00A9 f\u00C3\u00ADsico ou virtual, sendo: (true: Sim), (false: N\u00C3\u00A3o)).
   **/
  public EstabelecimentoPersist flagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Flag indicando se o terminal \u00C3\u00A9 f\u00C3\u00ADsico ou virtual, sendo: (true: Sim), (false: N\u00C3\u00A3o)).")
  @JsonProperty("flagTerminalVirtual")
  public Boolean getFlagTerminalVirtual() {
    return flagTerminalVirtual;
  }
  public void setFlagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
  }

  
  /**
   * Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00C3\u00A3o)).
   **/
  public EstabelecimentoPersist flagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00C3\u00A3o)).")
  @JsonProperty("flagConsultaExtrato")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstabelecimentoPersist estabelecimentoPersist = (EstabelecimentoPersist) o;
    return Objects.equals(this.flagMatriz, estabelecimentoPersist.flagMatriz) &&
        Objects.equals(this.idCredor, estabelecimentoPersist.idCredor) &&
        Objects.equals(this.numeroReceitaFederal, estabelecimentoPersist.numeroReceitaFederal) &&
        Objects.equals(this.nome, estabelecimentoPersist.nome) &&
        Objects.equals(this.descricao, estabelecimentoPersist.descricao) &&
        Objects.equals(this.nomeFantasia, estabelecimentoPersist.nomeFantasia) &&
        Objects.equals(this.cep, estabelecimentoPersist.cep) &&
        Objects.equals(this.nomeLogradouro, estabelecimentoPersist.nomeLogradouro) &&
        Objects.equals(this.numeroEndereco, estabelecimentoPersist.numeroEndereco) &&
        Objects.equals(this.bairro, estabelecimentoPersist.bairro) &&
        Objects.equals(this.cidade, estabelecimentoPersist.cidade) &&
        Objects.equals(this.complemento, estabelecimentoPersist.complemento) &&
        Objects.equals(this.uf, estabelecimentoPersist.uf) &&
        Objects.equals(this.cep2, estabelecimentoPersist.cep2) &&
        Objects.equals(this.nomeLogradouro2, estabelecimentoPersist.nomeLogradouro2) &&
        Objects.equals(this.numeroEndereco2, estabelecimentoPersist.numeroEndereco2) &&
        Objects.equals(this.bairro2, estabelecimentoPersist.bairro2) &&
        Objects.equals(this.cidade2, estabelecimentoPersist.cidade2) &&
        Objects.equals(this.complemento2, estabelecimentoPersist.complemento2) &&
        Objects.equals(this.uf2, estabelecimentoPersist.uf2) &&
        Objects.equals(this.obs, estabelecimentoPersist.obs) &&
        Objects.equals(this.contato, estabelecimentoPersist.contato) &&
        Objects.equals(this.email, estabelecimentoPersist.email) &&
        Objects.equals(this.flagArquivoSecrFazenda, estabelecimentoPersist.flagArquivoSecrFazenda) &&
        Objects.equals(this.flagCartaoDigitado, estabelecimentoPersist.flagCartaoDigitado) &&
        Objects.equals(this.inativo, estabelecimentoPersist.inativo) &&
        Objects.equals(this.idMoeda, estabelecimentoPersist.idMoeda) &&
        Objects.equals(this.idPais, estabelecimentoPersist.idPais) &&
        Objects.equals(this.associadoSPCBrasil, estabelecimentoPersist.associadoSPCBrasil) &&
        Objects.equals(this.mcc, estabelecimentoPersist.mcc) &&
        Objects.equals(this.idTipoEstabelecimento, estabelecimentoPersist.idTipoEstabelecimento) &&
        Objects.equals(this.tipoCorrespondencia, estabelecimentoPersist.tipoCorrespondencia) &&
        Objects.equals(this.cargoContato, estabelecimentoPersist.cargoContato) &&
        Objects.equals(this.tipoPagamento, estabelecimentoPersist.tipoPagamento) &&
        Objects.equals(this.consulta, estabelecimentoPersist.consulta) &&
        Objects.equals(this.consulta2, estabelecimentoPersist.consulta2) &&
        Objects.equals(this.consulta3, estabelecimentoPersist.consulta3) &&
        Objects.equals(this.flagTerminalVirtual, estabelecimentoPersist.flagTerminalVirtual) &&
        Objects.equals(this.flagConsultaExtrato, estabelecimentoPersist.flagConsultaExtrato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagMatriz, idCredor, numeroReceitaFederal, nome, descricao, nomeFantasia, cep, nomeLogradouro, numeroEndereco, bairro, cidade, complemento, uf, cep2, nomeLogradouro2, numeroEndereco2, bairro2, cidade2, complemento2, uf2, obs, contato, email, flagArquivoSecrFazenda, flagCartaoDigitado, inativo, idMoeda, idPais, associadoSPCBrasil, mcc, idTipoEstabelecimento, tipoCorrespondencia, cargoContato, tipoPagamento, consulta, consulta2, consulta3, flagTerminalVirtual, flagConsultaExtrato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstabelecimentoPersist {\n");
    
    sb.append("    flagMatriz: ").append(toIndentedString(flagMatriz)).append("\n");
    sb.append("    idCredor: ").append(toIndentedString(idCredor)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    nomeFantasia: ").append(toIndentedString(nomeFantasia)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    nomeLogradouro: ").append(toIndentedString(nomeLogradouro)).append("\n");
    sb.append("    numeroEndereco: ").append(toIndentedString(numeroEndereco)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    cep2: ").append(toIndentedString(cep2)).append("\n");
    sb.append("    nomeLogradouro2: ").append(toIndentedString(nomeLogradouro2)).append("\n");
    sb.append("    numeroEndereco2: ").append(toIndentedString(numeroEndereco2)).append("\n");
    sb.append("    bairro2: ").append(toIndentedString(bairro2)).append("\n");
    sb.append("    cidade2: ").append(toIndentedString(cidade2)).append("\n");
    sb.append("    complemento2: ").append(toIndentedString(complemento2)).append("\n");
    sb.append("    uf2: ").append(toIndentedString(uf2)).append("\n");
    sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    flagArquivoSecrFazenda: ").append(toIndentedString(flagArquivoSecrFazenda)).append("\n");
    sb.append("    flagCartaoDigitado: ").append(toIndentedString(flagCartaoDigitado)).append("\n");
    sb.append("    inativo: ").append(toIndentedString(inativo)).append("\n");
    sb.append("    idMoeda: ").append(toIndentedString(idMoeda)).append("\n");
    sb.append("    idPais: ").append(toIndentedString(idPais)).append("\n");
    sb.append("    associadoSPCBrasil: ").append(toIndentedString(associadoSPCBrasil)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    idTipoEstabelecimento: ").append(toIndentedString(idTipoEstabelecimento)).append("\n");
    sb.append("    tipoCorrespondencia: ").append(toIndentedString(tipoCorrespondencia)).append("\n");
    sb.append("    cargoContato: ").append(toIndentedString(cargoContato)).append("\n");
    sb.append("    tipoPagamento: ").append(toIndentedString(tipoPagamento)).append("\n");
    sb.append("    consulta: ").append(toIndentedString(consulta)).append("\n");
    sb.append("    consulta2: ").append(toIndentedString(consulta2)).append("\n");
    sb.append("    consulta3: ").append(toIndentedString(consulta3)).append("\n");
    sb.append("    flagTerminalVirtual: ").append(toIndentedString(flagTerminalVirtual)).append("\n");
    sb.append("    flagConsultaExtrato: ").append(toIndentedString(flagConsultaExtrato)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

