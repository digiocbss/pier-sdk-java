package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{conta_persist_description}}}
 **/

@ApiModel(description = "{{{conta_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaPersistValue   {
  
  private Long idPessoa = null;
  private Long idOrigemComercial = null;
  private Long idProduto = null;
  private Integer diaVencimento = null;
  private BigDecimal valorRenda = null;
  private String canalEntrada = null;
  private Integer valorPontuacao = null;
  private Long idEnderecoCorrespondencia = null;
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParcelas = null;
  private BigDecimal limiteConsignado = null;
  private Integer flagFaturaPorEmail = null;
  private String funcaoAtiva = null;
  private String matricula = null;
  private String responsavelDigitacao = null;
  private Integer idPromotorVenda = null;

  
  /**
   * {{{conta_persist_id_pessoa_value}}}
   **/
  public ContaPersistValue idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{conta_persist_id_origem_comercial_value}}}
   **/
  public ContaPersistValue idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{conta_persist_id_produto_value}}}
   **/
  public ContaPersistValue idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{conta_persist_dia_vencimento_value}}}
   **/
  public ContaPersistValue diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_dia_vencimento_value}}}")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{conta_persist_valor_renda_value}}}
   **/
  public ContaPersistValue valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_valor_renda_value}}}")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{conta_persist_canal_entrada_value}}}
   **/
  public ContaPersistValue canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_persist_canal_entrada_value}}}")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * {{{conta_persist_valor_pontuacao_value}}}
   **/
  public ContaPersistValue valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_valor_pontuacao_value}}}")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * {{{conta_persist_id_endereco_correspondencia_value}}}
   **/
  public ContaPersistValue idEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_id_endereco_correspondencia_value}}}")
  @JsonProperty("idEnderecoCorrespondencia")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * {{{conta_persist_limite_global_value}}}
   **/
  public ContaPersistValue limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_limite_global_value}}}")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{conta_persist_limite_maximo_value}}}
   **/
  public ContaPersistValue limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_limite_maximo_value}}}")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{conta_persist_limite_parcelas_value}}}
   **/
  public ContaPersistValue limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_limite_parcelas_value}}}")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * {{{conta_persist_limite_consignado_value}}}
   **/
  public ContaPersistValue limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_limite_consignado_value}}}")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * {{{conta_persist_flag_fatura_por_email_value}}}
   **/
  public ContaPersistValue flagFaturaPorEmail(Integer flagFaturaPorEmail) {
    this.flagFaturaPorEmail = flagFaturaPorEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_persist_flag_fatura_por_email_value}}}")
  @JsonProperty("flagFaturaPorEmail")
  public Integer getFlagFaturaPorEmail() {
    return flagFaturaPorEmail;
  }
  public void setFlagFaturaPorEmail(Integer flagFaturaPorEmail) {
    this.flagFaturaPorEmail = flagFaturaPorEmail;
  }

  
  /**
   * {{{conta_persist_funcao_ativa_value}}}
   **/
  public ContaPersistValue funcaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_persist_funcao_ativa_value}}}")
  @JsonProperty("funcaoAtiva")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_matricula_value}}}
   **/
  public ContaPersistValue matricula(String matricula) {
    this.matricula = matricula;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_matricula_value}}}")
  @JsonProperty("matricula")
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_responsavelDigitacao_value}}}
   **/
  public ContaPersistValue responsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_responsavelDigitacao_value}}}")
  @JsonProperty("responsavelDigitacao")
  public String getResponsavelDigitacao() {
    return responsavelDigitacao;
  }
  public void setResponsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_idPromotorVenda_value}}}
   **/
  public ContaPersistValue idPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_idPromotorVenda_value}}}")
  @JsonProperty("idPromotorVenda")
  public Integer getIdPromotorVenda() {
    return idPromotorVenda;
  }
  public void setIdPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaPersistValue contaPersistValue = (ContaPersistValue) o;
    return Objects.equals(this.idPessoa, contaPersistValue.idPessoa) &&
        Objects.equals(this.idOrigemComercial, contaPersistValue.idOrigemComercial) &&
        Objects.equals(this.idProduto, contaPersistValue.idProduto) &&
        Objects.equals(this.diaVencimento, contaPersistValue.diaVencimento) &&
        Objects.equals(this.valorRenda, contaPersistValue.valorRenda) &&
        Objects.equals(this.canalEntrada, contaPersistValue.canalEntrada) &&
        Objects.equals(this.valorPontuacao, contaPersistValue.valorPontuacao) &&
        Objects.equals(this.idEnderecoCorrespondencia, contaPersistValue.idEnderecoCorrespondencia) &&
        Objects.equals(this.limiteGlobal, contaPersistValue.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, contaPersistValue.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, contaPersistValue.limiteParcelas) &&
        Objects.equals(this.limiteConsignado, contaPersistValue.limiteConsignado) &&
        Objects.equals(this.flagFaturaPorEmail, contaPersistValue.flagFaturaPorEmail) &&
        Objects.equals(this.funcaoAtiva, contaPersistValue.funcaoAtiva) &&
        Objects.equals(this.matricula, contaPersistValue.matricula) &&
        Objects.equals(this.responsavelDigitacao, contaPersistValue.responsavelDigitacao) &&
        Objects.equals(this.idPromotorVenda, contaPersistValue.idPromotorVenda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idOrigemComercial, idProduto, diaVencimento, valorRenda, canalEntrada, valorPontuacao, idEnderecoCorrespondencia, limiteGlobal, limiteMaximo, limiteParcelas, limiteConsignado, flagFaturaPorEmail, funcaoAtiva, matricula, responsavelDigitacao, idPromotorVenda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPersistValue {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
    sb.append("    canalEntrada: ").append(toIndentedString(canalEntrada)).append("\n");
    sb.append("    valorPontuacao: ").append(toIndentedString(valorPontuacao)).append("\n");
    sb.append("    idEnderecoCorrespondencia: ").append(toIndentedString(idEnderecoCorrespondencia)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteMaximo: ").append(toIndentedString(limiteMaximo)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    limiteConsignado: ").append(toIndentedString(limiteConsignado)).append("\n");
    sb.append("    flagFaturaPorEmail: ").append(toIndentedString(flagFaturaPorEmail)).append("\n");
    sb.append("    funcaoAtiva: ").append(toIndentedString(funcaoAtiva)).append("\n");
    sb.append("    matricula: ").append(toIndentedString(matricula)).append("\n");
    sb.append("    responsavelDigitacao: ").append(toIndentedString(responsavelDigitacao)).append("\n");
    sb.append("    idPromotorVenda: ").append(toIndentedString(idPromotorVenda)).append("\n");
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

