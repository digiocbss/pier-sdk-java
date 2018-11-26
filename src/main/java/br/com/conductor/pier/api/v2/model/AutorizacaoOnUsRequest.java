package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{autorizacao_on_us_request_description}}}
 **/

@ApiModel(description = "{{{autorizacao_on_us_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AutorizacaoOnUsRequest   {
  
  private String nsuOrigem = null;
  private Long numeroParcelas = null;
  private String codigoProcessamento = null;
  private String codigoSegurancaCartao = null;
  private String nomeEstabelecimento = null;
  private BigDecimal valorTransacao = null;
  private String numeroRealCartao = null;
  private String dataValidadeCartao = null;
  private Long numeroEstabelecimento = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;

  
  /**
   * {{{transacao_on_us_request_nsu_origem_value}}}
   **/
  public AutorizacaoOnUsRequest nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_request_nsu_origem_value}}}")
  @JsonProperty("nsuOrigem")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * {{{autorizacao_on_us_request_numero_parcelas_value}}}
   **/
  public AutorizacaoOnUsRequest numeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{autorizacao_on_us_request_numero_parcelas_value}}}")
  @JsonProperty("numeroParcelas")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{transacao_on_us_request_codigo_processamento_value}}}
   **/
  public AutorizacaoOnUsRequest codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_request_codigo_processamento_value}}}")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{autorizacao_on_us_request_codigo_seguranca_cartao_value}}}
   **/
  public AutorizacaoOnUsRequest codigoSegurancaCartao(String codigoSegurancaCartao) {
    this.codigoSegurancaCartao = codigoSegurancaCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{autorizacao_on_us_request_codigo_seguranca_cartao_value}}}")
  @JsonProperty("codigoSegurancaCartao")
  public String getCodigoSegurancaCartao() {
    return codigoSegurancaCartao;
  }
  public void setCodigoSegurancaCartao(String codigoSegurancaCartao) {
    this.codigoSegurancaCartao = codigoSegurancaCartao;
  }

  
  /**
   * {{{autorizacao_on_us_request_nome_estabelecimento_value}}}
   **/
  public AutorizacaoOnUsRequest nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{autorizacao_on_us_request_nome_estabelecimento_value}}}")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{transacao_on_us_request_valor_transacao_value}}}
   **/
  public AutorizacaoOnUsRequest valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "10.25", required = true, value = "{{{transacao_on_us_request_valor_transacao_value}}}")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{transacao_on_us_request_numero_real_cartao_value}}}
   **/
  public AutorizacaoOnUsRequest numeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_request_numero_real_cartao_value}}}")
  @JsonProperty("numeroRealCartao")
  public String getNumeroRealCartao() {
    return numeroRealCartao;
  }
  public void setNumeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
  }

  
  /**
   * {{{transacao_on_us_request_data_validade_cartao_value}}}
   **/
  public AutorizacaoOnUsRequest dataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_request_data_validade_cartao_value}}}")
  @JsonProperty("dataValidadeCartao")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * {{{transacao_on_us_request_numero_estabelecimento_value}}}
   **/
  public AutorizacaoOnUsRequest numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_request_numero_estabelecimento_value}}}")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * {{{transacao_on_us_request_data_hora_terminal_value}}}
   **/
  public AutorizacaoOnUsRequest dataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_request_data_hora_terminal_value}}}")
  @JsonProperty("dataHoraTerminal")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * {{{transacao_on_us_request_terminal_requisitante_value}}}
   **/
  public AutorizacaoOnUsRequest terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_request_terminal_requisitante_value}}}")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutorizacaoOnUsRequest autorizacaoOnUsRequest = (AutorizacaoOnUsRequest) o;
    return Objects.equals(this.nsuOrigem, autorizacaoOnUsRequest.nsuOrigem) &&
        Objects.equals(this.numeroParcelas, autorizacaoOnUsRequest.numeroParcelas) &&
        Objects.equals(this.codigoProcessamento, autorizacaoOnUsRequest.codigoProcessamento) &&
        Objects.equals(this.codigoSegurancaCartao, autorizacaoOnUsRequest.codigoSegurancaCartao) &&
        Objects.equals(this.nomeEstabelecimento, autorizacaoOnUsRequest.nomeEstabelecimento) &&
        Objects.equals(this.valorTransacao, autorizacaoOnUsRequest.valorTransacao) &&
        Objects.equals(this.numeroRealCartao, autorizacaoOnUsRequest.numeroRealCartao) &&
        Objects.equals(this.dataValidadeCartao, autorizacaoOnUsRequest.dataValidadeCartao) &&
        Objects.equals(this.numeroEstabelecimento, autorizacaoOnUsRequest.numeroEstabelecimento) &&
        Objects.equals(this.dataHoraTerminal, autorizacaoOnUsRequest.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, autorizacaoOnUsRequest.terminalRequisitante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, numeroParcelas, codigoProcessamento, codigoSegurancaCartao, nomeEstabelecimento, valorTransacao, numeroRealCartao, dataValidadeCartao, numeroEstabelecimento, dataHoraTerminal, terminalRequisitante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutorizacaoOnUsRequest {\n");
    
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    codigoSegurancaCartao: ").append(toIndentedString(codigoSegurancaCartao)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    numeroRealCartao: ").append(toIndentedString(numeroRealCartao)).append("\n");
    sb.append("    dataValidadeCartao: ").append(toIndentedString(dataValidadeCartao)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    dataHoraTerminal: ").append(toIndentedString(dataHoraTerminal)).append("\n");
    sb.append("    terminalRequisitante: ").append(toIndentedString(terminalRequisitante)).append("\n");
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

