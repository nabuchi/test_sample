package net.nabnet.test_sample

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.beans.factory.annotation.Value
import org.springframework.test.context.TestPropertySource

@RunWith(SpringRunner::class)
@SpringBootTest
@TestPropertySource(locations = ["/test.properties"])
class TestSampleApplicationTests {
	@Value("\${aaa}")
	lateinit var url: String

	@Test
	fun testSample() {
		throw RuntimeException(url)
	}

}

